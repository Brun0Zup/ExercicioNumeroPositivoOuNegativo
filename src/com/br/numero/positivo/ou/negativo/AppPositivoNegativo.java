package com.br.numero.positivo.ou.negativo;

import java.util.Scanner;

public class AppPositivoNegativo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o número:");
		numero = entrada.nextInt();
		
		if(numero > 0) {
			System.out.println("Numero positivo");
		}else {
			System.out.println("Numero negativo");
		}

	}

}
