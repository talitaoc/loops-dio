package br.com.bootcampdio.loops;

import java.util.Scanner;

/*
 * Peça uma nota entre zero e dez
 * mostre mensagem caso o valor seja invalido e continue pedindo
 * até que o valor seja válido
 */

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.println("Nota inválida! Digite novamente. ");
			nota = scan.nextInt();
		}
		scan.close();
	}
}
