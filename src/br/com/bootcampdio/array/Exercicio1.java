package br.com.bootcampdio.array;
/*
 * Crie um vetor de 6 numeros inteiros e mostre-os na ordem inversa
 */
public class Exercicio1 {

	public static void main(String[] args) {
		
		int[] vetor = {-5, -6, 15, 50, 8, 4};
		
		int count = 0;
		
		System.out.println("Vetor: ");
		
		while(count < vetor.length) {
			
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		System.out.println("\nVetor: ");
		
		for (int i = vetor.length -1; i >= 0; i--) {
			
			System.out.print( vetor[i] + " ");
			
		}
	}
}
