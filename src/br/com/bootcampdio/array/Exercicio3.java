package br.com.bootcampdio.array;

import java.util.Random;

/*
 * Faça um programna que leia 20 numeros inteiros aleatorios (entre 0 e 100) 
 * armazenar em um vetor
 * Ao final mostre os numeros e seus sucessores.
 */
public class Exercicio3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int [] numeroAleatorio = new int[20];
		
		for (int i = 0; i < numeroAleatorio.length; i++) {
			
			int numero = random.nextInt(100);
			numeroAleatorio[i] = numero;
		}
		
		System.out.println("Números aleatórios: ");
		for (int numero : numeroAleatorio) {
			
			System.out.print(numero + " ");
		}
		
		System.out.println("\n\n\nSucessores números aleatórios: ");
		for (int numero : numeroAleatorio) {
			
			System.out.print((numero + 1) + " ");
		}
		
		System.out.println("\n\n\nAntecessor números aleatórios: ");
		for (int numero : numeroAleatorio) {
			
			System.out.print((numero - 1) + " ");
		}
	}
}
