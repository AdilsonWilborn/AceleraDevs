package com.stefanini.cursojavabasico.variaveis;

public class Vetor {
	public static void main (String [] args) {
		int [] notas = new int [10];  //[10] = tamanho fixo do array
		
		notas[0] = 1;
		notas[2] = 5; //na posição 2, o valor é 5
		notas[6] = 9;
		notas[4] = 2;
		notas[1] = 4;
		notas[9] = 7;
		notas[7] = 8;
		
		System.out.println(notas[0]);
		System.out.println(notas[2]);
		System.out.println(notas[6]);
		System.out.println(notas[4]);
		System.out.println(notas[1]);
		System.out.println(notas[9]);
		System.out.println(notas[7]);
		
		System.out.println("---------------------------");
		
		for (int i =0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		System.out.println("---------------------------");
		System.out.println("FOR EACH");
		System.out.println("---------------------------");
		
		String [] carros = new String[] {"BMW i320", "Mercedes c180", "BMW M3", "Mercedes AMG", "Tela Model S"};
		System.out.println(carros.length);
		
		for (String carro : carros) {
			System.out.println(carro);
			
		}
	}
	
	
}
