package br.com.loiane.exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int maior = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite o " + i + "� numero: ");
			int n = scanner.nextInt();
			if ( n > maior) {
				maior = n;
			}
		}
		System.out.println("O maior valor digitado foi: " + maior);
	}

}