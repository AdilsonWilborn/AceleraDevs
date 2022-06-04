
public class Loop {
	public static void main(String[] args) {
		int count = 101;
		
		while(count < 100) {
			System.out.println("count: " + count);
			count++;
		}
		
		int countDois = 101;
		do {
			System.out.println(countDois);
			countDois++;
		} while(countDois <100);
	
		//for normal:
		
		for (int i = 0; i < 10 ; i++) {  //i = 0 enquanto i <100 adicionai +1 e faz o código abaixo
			System.out.println(i);
		}
		
		//for com areas ausentes:
			int i = 0;
			for ( ; i < 10 ; ) { 
					System.out.println(i);
					i++;
				}
			//for com todas areas ausentes:
			for (;;) {
				System.out.println("for");
			}
				
	}
}
