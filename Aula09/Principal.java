
public class Principal {
	public static void main(String[] args) {
		Carro bmw = new Carro();  // Tipo Carro- Variavel bmw 
		bmw.marca = "BMW";
		bmw.modelo= "M3";
		bmw.quilometrosPorLitro = 7.5;
		bmw.aceleracao= 50;
		bmw.velocidadeMaxima= 280;
		
		System.out.println(bmw);  // Aqui ele imprime apenas a refer�ncia de mem�ria.
		
		System.out.println(bmw.marca);
		System.out.println(bmw.modelo);
		System.out.println(bmw.quilometrosPorLitro);
		System.out.println(bmw.aceleracao);
		System.out.println(bmw.velocidadeMaxima);

		bmw.acelerar();
		bmw.frear();
	}
	

}
