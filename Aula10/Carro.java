
public class Carro {
	//Classe ? composta por atributos e m?todos.
	//Os atributos s?o as caracteristicas que definem aquele objeto.
	//Metodos s?o as a??es, aquilo que o objeto pode exercer, por exemplo o carro, acelerar...freiar... etc...
	
	//atributos:
	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometrosPorLitro;
	//fim atributos.
	
	// Observa??o: Classe tamb?m vira um tipo de dado, o tipo carro.
	
	//==========================================================
	//CRIANDO A??ES / M?TODOS!
	//TEM QUE SER P?BLICO PARA OS USU?RIOS PODEREM ACESSAR.
	//==========================================================
	
	public void acelerar() {  //coloco void para dizer que n?o quero RETORNAR NADA | dentro dos ( ) ? os argumentos, aqui nada.
		System.out.println("Acelerando....");
	}
	public void frear() {
		System.out.println("Freando....");
	}
	//==========================================================
	//ENCAPSULAMENTO :
	//==========================================================
	
	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double tempoInicial ) {
		return (velocidadeFinal - velocidadeInicial ) / (tempoFinal - tempoInicial) * 3.6;  //Calcular por km por hora, multiplica por 3.6
	}
	//EXEMPLO SOBRECARGA: CRIANDO OUTRO M?TODO COM O MESMO NOME, MAS COM ASSINATURA DIFERENTE
	public double calcularTaxaAceleracao(double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
	}
	//EXEMPLO SOBRECARGA: CRIANDO OUTRO M?TODO COM O MESMO NOME, MAS COM ASSINATURA DIFERENTE e tipo diferente
	public String calcularTaxaAceleracao(int velocidadeFinal, int tempoFinal) {
		return " " + (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;  //coloco " " pq ele tem que devolver uma String, ai concateno com o restante da info.
	}
	
	//==========================================================
	//ENCAPSULAMENTO EXPLICA??O
	//==========================================================
	/* MODIFICADORES DE ACESSO => CARACTERISTICAS
	 * DEFAULT => N?O TEM UMA PALAVRA CHAVE QUE O DEFINA.ACESSIVEL NA PR?PRIA CLASSE OU CLASSE UM MESMO PACOTE
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
	public void setVelocidadeMaxima(int velocidadeMaxima) {
		if (velocidadeMaxima < 0) {
			System.out.println("Valor ? inv?lido!");
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
		
}
