package view;

import java.util.Random;

import controller.HashTabela;

public class Principal {
	
	 public static void main(String[] args) {
	        int N = 10; // Tamanho do vetor de teste
	        int[] numbers = generateRandomNumbers(N);
	        HashTabela hashTable = new HashTabela(2);
	        for (int num : numbers) {
	            hashTable.insert(num);
	        }
	        hashTable.display();
	 }

	private static int[] generateRandomNumbers(int n) {
		 int[] numbers = new int[n];
	        Random random = new Random();
	        for (int i = 0; i < n; i++) {
	            numbers[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
	        }
	        return numbers;
	    }
	}


