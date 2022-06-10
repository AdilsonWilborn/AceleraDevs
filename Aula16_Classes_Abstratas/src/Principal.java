
public class Principal {
	public static void main(String[] args) {
		//Carro bmw = new Carro();  // Tipo Carro- Variavel bmw 
		//bmw.setMarca ( "BMW");
		//bmw.setModelo( "M3");
		//bmw.setQuilometrosPorLitro(7.5);

	
		

		
		//outro construtor:
		
	//	Carro mercedes = new Carro ("Mercedes","c180");
		
		BMW bmwDois = new BMW();
		System.out.println(bmwDois.calcularTaxaAceleracao(100.5, 10.5));
		bmwDois.piscarAlerta();
		
		//==============
		// Aula 15 Exceptions 
		BMW bmwTres = null;
		//bmwTres.acelerar();
		
		//tratar
		
		try {
		bmwDois.setVelocidadeMaxima(10);
		} catch (NegocioException e) {
			System.out.println(e);
		} finally {
			System.out.println("Passou aqui");
		}
		
		
		
		
		//==============
	
		Tesla tesla = new Tesla();
		tesla.isDirigeSozinho();
		
		
		
		
		Carro teslaDois = new Tesla();
		teslaDois.piscarAlerta();
		//CASTING == acessa as propriedades de ambos, transforma o genérico "carro" para o especifico "Tesla"
		((Tesla) teslaDois).setDirigeSozinho(true);
		System.out.println(((Tesla) teslaDois).isDirigeSozinho());
		//=======
		//Criando um array/ vetor de carros:
		Carro[] carros = new Carro[] {bmwDois,tesla,teslaDois};
		for (Carro carro : carros) {
			if (carro instanceof Tesla)  {//checar se o carro é do tipo Tesla
				System.out.println(((Tesla)carro).isDirigeSozinho());
			}
			}
		
	
		
		//do outro construtor- impressao
		


		System.out.println(bmwDois.calcularTaxaAceleracao(100.50, 10));
		System.out.println(tesla.calcularTaxaAceleracao(100.50, 10));
		
		
	
	}
	

	

}
