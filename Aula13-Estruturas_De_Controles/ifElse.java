
public class ifElse {

	public static void main(String[] args) {
		int nota = 10;
		
		//if
		if (nota >= 7) {
			System.out.println("Aprovado");
		}
		//if sem bloco -- não recomendado -- deixa aplicação propicia a erros.
		if (nota >= 9) 
			System.out.println("Aprovado");
			System.out.println("Parabéns!");
		
			//if else
			
			if (nota >= 7) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}		
			
			// IF ELSE IF   ===  encadeamento de ifs
			
			if (nota >= 9) {
				System.out.println("Aprovado!");
				System.out.println("Parabéns!");
			} else if (nota>=7) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}
	}
	
	
}
