package com.stefanini.cursojavabasico.variaveis;

public class Vetores {
	public static void main(String[] args) {
		int [] notas = new int [10];  //array do tipo inteiro, chaves indica que é um array, nome da var, operador de atribuição, nem crio uma instancia desse array, [10] declaro o tamanho (quando vazio, precisa declarar)
		
		notas [0] = 5;
		notas [3] = 9;
	
		int [][] matriz = new int [5][5];
		matriz[0][1]= 5;
		matriz[2][4]= 10;
		matriz[3][2]= 15;
		
		
		System.out.println("Tamanho:");
		System.out.println(notas.length);
		System.out.println("Printando manual:");
		System.out.println(notas[0]);
		System.out.println(notas[3]);
		System.out.println("Printando com o FOR:");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println("---------------------------------------------");

		String [] meses = new String[] {"Janeiro","Fevereiro","Março","Abril","Maio"};
		
		System.out.println(meses.length);
		for (String m: meses) {
			System.out.println(m);
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("MATRIZES");
		
		System.out.println(matriz [0] [1]);
		System.out.println(matriz [2] [4]);
		System.out.println(matriz [3] [2]);
		
		System.out.println("USANDO O FOR EACH PARA PRINTAR");
		for (int [] m: matriz) {
			for (int v: m) {
				System.out.println(v);
			}
		}
	}
}
