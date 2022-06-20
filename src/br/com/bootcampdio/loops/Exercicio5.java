package br.com.bootcampdio.loops;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada
 * capaz de gerar a tabuada de qualquer numero interiro entre 1 e 10
 * O usuário deve informar de qual numero ele deseja ver a tabuada.
 * A sauda deve ser conforme o exemplo:
 *
 *tabuada do 5
 * 5 x 1 = 5
 * 5 x 2 = 10
 * ....
 * 5 x 10 = 50
 */
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = scan.nextInt();
		
		System.out.println("Tabuada do " + tabuada);
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
		}
		
		scan.close();
		
		
	}
}
