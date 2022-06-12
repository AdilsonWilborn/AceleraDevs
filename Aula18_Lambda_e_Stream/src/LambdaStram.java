import java.util.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;


public class LambdaStram {

	// LAMBDA como se fosse um método, no sentido que pode passar parametro, tem um corpo e retorna algum tipo de dado.
	// são métodos, mas ao mesmo tempo não são, pois não dependem de classes para exister, ao contrário do método
	// LAMBDA é como se fosse uma função anônima
	// THIS dentro da LAMBDA não diz respeito a LAMBDA e sim a classe a onde a LAMBDA foi criada
	static int gerarIdade (int min, int max) {
		return new SplittableRandom().nextInt(min,max);
	}
	public static void main (String[] args) {
		List<String> nomes = Arrays.asList("Alice", "João", "Maria", "Pedro","Raquel","Samuel");
		
		//Interface list para trabalhar com coleções de dados (parecido com array) (do java util)
		//Arrays para criar lista criando elementos que compoe ela (do java util)
	   // EXPRESSÃ LAMBDA, pode passar um parametro, tem um corpo e retorna algo. (não precisa por o return, no mesmo momento que cria ele retorna)
		
		System.out.println("Lista de nomes: ");
		nomes.forEach((n) -> System.out.println(n));
		
		System.out.println("Lista de pessoas:");
		List <Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n, gerarIdade(15,30))).collect(Collectors.toList());
		pessoas.forEach((p) -> System.out.println(p.getNome()+ " " + p.getIdade()));
		
		System.out.println("Lista de Pessoas Maiores de idade: ");
		List<Pessoa> pessoasMaioresDeIdade = pessoas.stream().filter((p)-> p.getIdade() >=18).collect(Collectors.toList());
		pessoasMaioresDeIdade.forEach((p)-> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.println("Lista de pessoas ordenada: ");
		List<Pessoa> pessoasOrdenadas = pessoasMaioresDeIdade.stream().sorted((p1, p2)-> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
		pessoasOrdenadas.forEach(p -> System.out.println(p.getNome() + " " + p.getIdade()));
		
		System.out.println("Soma das idades:");
		Integer totalIdade = pessoasOrdenadas.stream().map(p -> p.getIdade()).reduce(0,(somaIdade, idade) -> somaIdade += idade);
		System.out.println("Total: " + totalIdade);
	}
}
