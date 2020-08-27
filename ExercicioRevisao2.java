package src;

import java.util.Scanner;

public class ExercicioRevisao2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número inteiro:");
		int numero = sc.nextInt();
		
		if(numero<0) {
			System.out.println("Número é negativo.");
		} else if(numero>0) {
			System.out.println("Número é positivo.");
		} else {
			System.out.println("O número é zero.");
		}
	
		
	}
	
}
