
public class Carro {
	//Classe é composta por atributos e métodos.
	//Os atributos são as caracteristicas que definem aquele objeto.
	//Metodos são as ações, aquilo que o objeto pode exercer, por exemplo o carro, acelerar...freiar... etc...
	
	//atributos:
	String marca;
	String modelo;
	int velocidadeMaxima;
	int aceleracao;
	double quilometrosPorLitro;
	//fim atributos.
	
	// Observação: Classe também vira um tipo de dado, o tipo carro.
	
	//==========================================================
	//CRIANDO AÇÕES / MÉTODOS!
	//==========================================================
	
	void acelerar() {  //coloco void para dizer que não quero RETORNAR NADA | dentro dos ( ) é os argumentos, aqui nada.
		System.out.println("Acelerando....");
	}
	void frear() {
		System.out.println("Freando....");
	}
	
}
