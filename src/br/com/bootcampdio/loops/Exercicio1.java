package br.com.bootcampdio.loops;

import java.util.Scanner;

/*
 * Faça um programa que leia conjuntos de dois valores,
 * o primeiuro representando o nome do alino e o segundo representando a sua idade
 * (pare o programa inserindo o valor 0 no campo nome)
 */
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true){
			
			System.out.println("Nome: ");
			nome = scan.nextLine();
			
			if(nome.equals("0")) break;
			
			System.out.println("Idade: ");
			idade = scan.nextInt();
			scan.nextLine();
		}
		scan.close();
		
	}
	
}
