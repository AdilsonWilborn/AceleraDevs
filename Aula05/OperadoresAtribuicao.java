package com.stefanini.cursojavabasico.variaveis;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
	
		int a = 11; //operador de atribui��o
		int b = 5;
		
		b += a; // ADITIVO
		//b = b + a;
		b -= a; // SUBTRATIVO
		//b = b -a;
		b *=a; // MULTIPLICATIVO
		//b = b * a;
		b /= a; //DIVISIVO
		b %= a; //MODULAR   | Ele pega o RESTO da DIVIS�O
		
		System.out.println(a % b);
	}
	
}
