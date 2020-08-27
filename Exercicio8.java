package src;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número inteiro:");
		int n1 = sc.nextInt();

		System.out.println("Digite o segundo número inteiro:");
		int n2 = sc.nextInt();

		System.out.println("Digite o terceiro número inteiro:");
		int n3 = sc.nextInt();

		if (n1 == n2 || n2 == n3 || n1==n3) {
			System.out.println("Não digitar números iguais.");
		} else {
			

			if (n1 > n2) {
				if (n1 > n3) {
					if (n2 > n3) {
						System.out.println("A ordem dos numeros é: " + n1 + "-" + n2 + "-" + n3 );
					} else {
						System.out.println("A ordem dos numeros é: " + n1 + "-" + n3 + "-" + n2 );
					}
				}
			} 

			if (n2 > n1) {
				if (n2 > n3) {
					if (n1 > n3) {
						System.out.println("A ordem dos numeros é: " + n2 + "-" + n1 + "-" + n3 );
					} else {
						System.out.println("A ordem dos numeros é: " + n2 + "-" + n3 + "-" + n1 );
					}
				} 
			} 
			
			if (n3 > n1) {
				if (n3 > n2) {
					if (n1 > n2) {
						System.out.println("A ordem dos numeros é: " + n3 + "-" + n1 + "-" + n2 );
					} else {
						System.out.println("A ordem dos numeros é: " + n3 + "-" + n2 + "-" + n1 );
					}
				} 
			} 
			
			
		}
	}

}
