
public class Carro {
	//Classe � composta por atributos e m�todos.
	//Os atributos s�o as caracteristicas que definem aquele objeto.
	//Metodos s�o as a��es, aquilo que o objeto pode exercer, por exemplo o carro, acelerar...freiar... etc...
	
	//atributos:
	String marca;
	String modelo;
	int velocidadeMaxima;
	int aceleracao;
	double quilometrosPorLitro;
	//fim atributos.
	
	// Observa��o: Classe tamb�m vira um tipo de dado, o tipo carro.
	
	//==========================================================
	//CRIANDO A��ES / M�TODOS!
	//==========================================================
	
	void acelerar() {  //coloco void para dizer que n�o quero RETORNAR NADA | dentro dos ( ) � os argumentos, aqui nada.
		System.out.println("Acelerando....");
	}
	void frear() {
		System.out.println("Freando....");
	}
	
}
