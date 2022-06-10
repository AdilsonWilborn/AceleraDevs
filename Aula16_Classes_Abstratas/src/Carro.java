
public abstract class Carro {
	//Classe é composta por atributos e métodos.
	//Os atributos são as caracteristicas que definem aquele objeto.
	//Metodos são as ações, aquilo que o objeto pode exercer, por exemplo o carro, acelerar...freiar... etc...
	
	//atributos:
	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometrosPorLitro;
	//fim atributos.
	
	// Observação: Classe também vira um tipo de dado, o tipo carro.
	
	//==========================================================
	//CRIANDO AÇÕES / MÉTODOS!
	//TEM QUE SER PÚBLICO PARA OS USUÁRIOS PODEREM ACESSAR.
	//==========================================================
	
	public void acelerar() {  //coloco void para dizer que não quero RETORNAR NADA | dentro dos ( ) é os argumentos, aqui nada.
		System.out.println("Acelerando....");
	}
	public void frear() {
		System.out.println("Freando....");
	}
	//==========================================================
	//ENCAPSULAMENTO :
	//==========================================================
	
	//AULA 16==
	public abstract void piscarAlerta() ;
	//Quem implementa esse método é as classes filhas.
	//===========================================================
	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial ) {
		return (velocidadeFinal - velocidadeInicial ) / (tempoFinal - tempoInicial) * 3.6;  //Calcular por km por hora, multiplica por 3.6
	}
	//EXEMPLO SOBRECARGA: CRIANDO OUTRO MÉTODO COM O MESMO NOME, MAS COM ASSINATURA DIFERENTE
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
	}
	//EXEMPLO SOBRECARGA: CRIANDO OUTRO MÉTODO COM O MESMO NOME, MAS COM ASSINATURA DIFERENTE e tipo diferente
	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return " " + (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;  //coloco " " pq ele tem que devolver uma String, ai concateno com o restante da info.
	}
	
	//==========================================================
	//ENCAPSULAMENTO EXPLICAÇÃO
	//==========================================================
	/* MODIFICADORES DE ACESSO => CARACTERISTICAS
	 * DEFAULT => NÃO TEM UMA PALAVRA CHAVE QUE O DEFINA.ACESSIVEL NA PRÓPRIA CLASSE OU CLASSE UM MESMO PACOTE
	 * PUBLIC  => ACESSIVEL PROPRIA CLASSE, CLASSE DO MESMO PACOTE, SUBCLASSES (EXTENDS), ACESSIVEL DE QUALQUER LUGAR
	 * PRIVATE => ACESSIVEL APENAS NA PROPRIA CLASSE
	 * PROTECTED => ACESSIVEL PROPRIA CLASSE, CLASSE DO MESMO PACOTE, SUBCLASSES (EXTENDS)
	 */
	//==========================================================
	//ENCAPSULAMENTO  GETTERS (pega) E SETTERS (insere):
	//==========================================================
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	//LANÇANDO EXCEÇÃO EXCEPTION -- Aula 15 Exceptions 
	public void setVelocidadeMaxima(int velocidadeMaxima) throws NegocioException {
		if (velocidadeMaxima < 0) {
			throw new NegocioException("Valor é inválido!");
		} else {
		this.velocidadeMaxima = velocidadeMaxima;
		}
	}
	public int getTaxaAceleracao() {
		return taxaAceleracao;
	}
	public void setTaxaAceleracao(int taxaAceleracao) {
		this.taxaAceleracao = taxaAceleracao;
	}
	public double getQuilometrosPorLitro() {
		return quilometrosPorLitro;
	}
	public void setQuilometrosPorLitro(double quilometrosPorLitro) {
		this.quilometrosPorLitro = quilometrosPorLitro;
	}
	//==========================================================
		//CONSTRUTORES ==> TODA CLASSE TEM UM CONSTRUTOR
		//========================================================
		// CONSTRUTOR DEFAULT:
	public Carro() {
		System.out.println("construindo carro...");
	}
	  //SOBRECARGA, CRIANDO OUTRO CONSTRUTOR, MESMO NOME, MAS ASSINATURA DIFERENTE
	public Carro(String marca, String modelo) {
		this.marca= marca;
		this.modelo= modelo;
	}
	
	// POLIMORFISMO
	
	//Fizemos de método e construtores, polimorfismo, significa MUITAS FORMAS, polimorfismo em tempo de compilação.
	//Existe o polimorfismo em tempo de EXECUÇÃO.
	
	
	//AULA 16: ANOTACOES
	//TODAS AS CLASSES HERDAM DO OBJETO OBJECT
		
}
