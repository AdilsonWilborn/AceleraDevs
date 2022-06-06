
public class For {
	public static void main(String[] args) {
		
		//FOR NORMAL
		
		for(int i= 1; i <= 10; i++) {
			System.out.println(i);
			for(int i2=1;i2<3;i2++) {
				System.out.println("teste");
			}
		}
		
		// FOR APENAS COM A CONDIÇÃO
		
		int i = 0;
		
		for (; i<10; ) {
			System.out.println(i);
			i++;
		}
		
		
		// FOR COM LOOP INFINITO
		
		for ( ; ; ) {
			System.out.println("Loop Infinito");
		}
	}
}
