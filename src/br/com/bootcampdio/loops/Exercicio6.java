package br.com.bootcampdio.loops;

import java.util.Scanner;

/*
 * Fatorial de um número inteiro
 *
 */
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número: ");
		int numero = scan.nextInt();
		
		System.out.println("Fatorial");
		
		int multiplicacao = 1;
		
		System.out.println(numero + "! = ");
		
		for (int i = numero; i >= 1 ; i--) {
			
			 multiplicacao = multiplicacao * i;
			
		}
		
		System.out.println(multiplicacao);
		
		
		scan.close();
	}
}
