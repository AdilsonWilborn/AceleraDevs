package com.stefanini.cursojavabasico.variaveis;

public class OperadoresLogicos {
	public static void main(String[] args) {
		/**
		 *  AND
		 *  V and F => F
		 *  V and V => V
		 *  F and V =>  F
		 *  F and F =>  F
		 *  OR
		 *  V or F => V
		 *  V or V => V
		 *  F or V => V
		 *  F or F => F
		 *  XOR
		 *  V xor F => V
		 *  V xor V => F
		 *  F xor V => V
		 *  F xor F => F
		 *  NEGAÇÃO LÓGICA
		 *  !V => F
		 *  !F => V
		 *  
		 */
		
		boolean v = true;
		boolean f = false;
		
		// and && ou & // && se a primeira for false, nem testa a segunda, o & testa todas as confições
		// or ||
		//xor !=
		// ! nega um valor
		
		System.out.println(v && f);
		System.out.println(v || f);
		System.out.println(v != f);
		System.out.println(!f);
	}
}
