package br.com.bootcampdio.loops;

import java.util.Scanner;

/*
 * Faça um programa que peça N numeros inteiros, calcule e mostre a quantidade de números
 * pares e a quantidade de número impares.
 */
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int numero;
		int quantidadePares = 0;
		int quantidadeImpares = 0;
		
		System.out.println("Quantidade de números: ");
		quantidadeNumeros = scan.nextInt();
		
		int count = 0;
		do {
			
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) {
				quantidadePares ++;
			} else {
				quantidadeImpares++;
			}
			
			count ++;
			
		}while(count < quantidadeNumeros);
		
		System.out.println("Quantidade Par:" + quantidadePares);
		System.out.println("Quantidade Ímpare " + quantidadeImpares);
		
		
		scan.close();
	}
}
