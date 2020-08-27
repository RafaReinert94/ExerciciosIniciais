package src;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

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

}
