package br.com.bootcampdio.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros e informe o maior numero
 * e a média desses números
 */
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count = 0;
		int maior = 0;
		int soma = 0;
		
		do {
			
			System.out.println("Informe um número: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if(numero > maior) {
				maior = numero;
			}
			
			count = count +1;
			
		} while(count < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + soma/5);
		
		scan.close();
	}
	
}
