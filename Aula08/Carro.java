package br.com.stefanini.orientacaoaobjetos;

public class Carro {
	
	//Esses s�o chamados de atributos:
	private String marca;
	private String modelo;
	private int chassi;
	private String placa;
	private int roda;
	private int bancos;
	private int velocidade;
	// Fim dos atributos.
	//============================================================================================================
	//Quando a gente cria uma classe, por default ela tem um CONSTRUTOR INTERNO.
	public Carro() {  	//Construtor n�o tem o retorno e recebe o mesmo nome da CLASSE.
		System.out.println("Construindo um carro");
	}
	//� POSS�VEL TER MAIS DE UM CONSTRUTOR NA MESMA CLASSE, mas preciso ter uma assinatura diferente do existente.
	public Carro(String marca) {
		this.marca= marca;
	}
	//Aqui sobrecarregamos o construtor, colocamos dois construtores, quando temos mais de 1, chamamos de SOBRECARGA / POLIMORFISMO (MUITAS FORMAS)
	
	//============================================================================================================
	
	// A GENTE ENCAPSULOU AQUI, ou seja a gente pegou o atributo do nosso modelo, e encapsulou, colocou dentro de um m�todo, para que n�o seja acessado diretamente
	public String acelerar() {     //A��O --
		return velocidade + " km/5s";
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}


	
	//se eu colocar como public, qualquer classe tem acesso, por�m, n�o � uma bota pratica, o ideal � deixar eles privado com acesso apenas a pr�pria classe ou alguns casos protected.
	//e criar formas de acesso, podemos usar getters e setters.
	//Assim eu crio o m�todo com um get | Tem que ser public para poder acessar por fora:
	
	public String getMarca() {  //como s� quero obter a informa��o de marca, n�o preciso colocar parametro
		return this.marca;            // eu falo que ele vai retornar a minha propria classe/estrutura, ai aqui eu retorno o atributo marca.
	}
	public void setMarca(String marca) {     //como estou apenas inserindo uma informa��o dentro de marca, n�o preciso devolver nada, ai uso VOID.
		this.marca = marca;                               //n�o tenho retorna, mas tenho uma atribui��o, fa�o o this.marca receber alguma coisa, ai tenho que passar 
		//os argumentos, a marca que quero que seja inserida no atributo marca do nosso modelo.
		//ali em cima eu criei um argumento String marca
		//parametro marca s� existe dentro do escopo do nosso m�todo (o primeiro), s�o variaveis distintas.
		
		//na classe executora, eu posso usar o m�todo usando xxx.getMarca()...
	}
	
	public String getModelo () {
		return this.modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getChassi() {
		return this.chassi;
	}
	public void setChassi(int chassi) {
		this.chassi = chassi;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		this.placa= placa;
	}
	
	public int getRoda() {
		return this.roda;
	}
	public void setRoda(int roda) {
		this.roda = roda;
	}
	
	public int getBancos() {
		return this.bancos;
	}
	public void setBancos(int bancos) {
		this.bancos= bancos;
	}
}
