
public class Principal {
	public static void main(String[] args) {
		Carro bmw = new Carro();  // Tipo Carro- Variavel bmw 
		bmw.setMarca ( "BMW");
		bmw.setModelo( "M3");
		bmw.setQuilometrosPorLitro(7.5);
		//bmw.taxaAceleracao= 50;
		bmw.setVelocidadeMaxima(280);
		
		
		//outro construtor:
		
		Carro mercedes = new Carro ("Mercedes","c180");
		
		BMW bmwDois = new BMW();
		System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
		
		System.out.println(bmw);  // Aqui ele imprime apenas a refer�ncia de mem�ria.
		
		
		//do outro construtor- impressao
		
		System.out.println(mercedes.getMarca());
		System.out.println(mercedes.getModelo());
		
		System.out.println(bmw.getMarca());
		System.out.println(bmw.getModelo());
		System.out.println(bmw.getQuilometrosPorLitro());
		System.out.println(bmw.getTaxaAceleracao());
		System.out.println(bmw.getVelocidadeMaxima());

		bmw.acelerar();
		bmw.frear();
		
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(),0,10,0));
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(),5));
		System.out.println(bmw.calcularTaxaAceleracao(100,5));
	}
	

}
