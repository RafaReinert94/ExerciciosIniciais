package src;

import java.util.Scanner;

public class ExerciciosEntregar1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá professor! Tudo bem?");
		System.out.println("Digite qual questão gostarias de ver:");
		System.out.println("5 - Exercicio 5");
		System.out.println("6 - Exercicio 6");
		System.out.println("7 - Exercicio 7");
		System.out.println("8 - Exercicio 8");
		
		int menu = sc.nextInt();

		switch (menu) {
		case 5:
			Exercicio5(); 
			break;
		case 6:
			Exercicio6();
			break;
		case 7:
			Exercicio7(); 
			break;
		case 8:
			Exercicio8(); 
			break;
		default:
			System.out.println("Você digitou um valor inválido.");
			break;
		}

		sc.close();
	}

	public static void Exercicio5() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento:");
		int ano = sc.nextInt();
		int anoatual = 2020;

		if (anoatual - ano < 16) {
			System.out.println("Você não pode votar.");
		} else {
			System.out.println("Você pode votar.");
		}

		sc.close();
	}

	public static void Exercicio6() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua senha de quatro digitos:");

		try {
			int senha = sc.nextInt();

			if (senha == 1234) {
				System.out.println("Acesso permitido.");
			} else {
				System.out.println("Acesso negado.");
			}
		} catch (Exception e) {
			System.out.println("Você digitou um caractere errado.");
		}
		sc.close();
	}

	public static void Exercicio7() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas maçãs você deseja?");
		int qtdade = sc.nextInt();

		if (qtdade < 12) {
			System.out.println("O valor total é de: " + (qtdade * 0.30));
		} else {
			System.out.println("O valor total é de: " + (qtdade * 0.25));
		}
		sc.close();
	}

	public static void Exercicio8() {
		
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
