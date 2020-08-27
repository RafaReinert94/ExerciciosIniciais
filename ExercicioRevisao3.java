package src;

import java.util.Scanner;

public class ExercicioRevisao3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean valido = false;

		try {

			System.out.println("Digite o lado 1:");
			double lado1 = sc.nextDouble();

			System.out.println("Digite o lado 2:");
			double lado2 = sc.nextDouble();

			System.out.println("Digite o lado 3:");
			double lado3 = sc.nextDouble();

			if (((lado1 + lado2) > lado3)) {
				if (((lado1 + lado3) > lado2)) {
					if (((lado2 + lado3) > lado1)) {
						System.out.println("� um tri�ngulo v�lido.");
						valido = true;
					}
				}
			} else {
				System.out.println("N�o � um tri�ngulo v�lido.");
				valido = false;
			}

			if (valido) {
				if (lado1 == lado2 && lado1 == lado3) {
					System.out.println("� um tri�ngulo equel�tero.");
				} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
					System.out.println("� um tri�ngulo Is�celes.");
				} else {
					System.out.println("� um tri�ngulo Escaleno.");
				}

			}
		} catch (Exception e) {
			System.out.println("Voc� digitou um caractere errado.");
		}

	}

}
