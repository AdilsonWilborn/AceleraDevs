package com.stefanini.cursojavabasico.variaveis;

public class Variaveis {
	public static void main(String[] args) {
		byte numByte = 127; //-128 a 127 (8bits)
		short numShort = 12321; //-32768 a 32767 (16bits)
		int numInt = 2147483647; // -2.147.483.648 a 2.147.483.647 (32bits)
		long numLong = 897997888; //-9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 (64bits)
		
		float numFloat = 10.000f; // (32bits)
		double numDouble = 10000000000000000.000; //64bits
		
		char varChar = 'F'; //0 a 65535 (16bits)
		
		boolean varBoolean= true; // true ou false (1bit)
		
		String texto = "Bem vindos Devs!";
		Integer numeroConta = 4000;
		Long numeroLongo = 1213123L;
		
		//Ele deve começar com uma letra minúscula. Exemplo: nome
		//Não deve começar com caracteres especiais como & (e comercial), $ (dólar), _(sublinhado). Exemplo: _nome
		//Evite usar variáveis de um caractere. Exemplo: a (tem que fazer sentido).
		
		String nome = "Adilson";
		
	}
}
