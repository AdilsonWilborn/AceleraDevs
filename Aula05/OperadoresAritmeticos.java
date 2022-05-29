package com.stefanini.cursojavabasico.variaveis;

public class OperadoresAritmeticos {
	
	public static void main(String[] args) {
		int soma = 10 + 5;
		int subtracao= 10 -5;
		int multiplicacao= 10 * 5;
		int divisao = 10/5;
		int modulo = 10 % 5;
		
		int a = 10;
		
		//a++; // POSTFIX //Incrementa *DEPOIS de COMPARAR* mais 1 no valor de 10, vai pra 11.
		//++a; // PREFIX // Incrementa mais 1
		
		System.out.println(a++ ==11);
	}
	

}
