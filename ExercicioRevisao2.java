package src;

import java.util.Scanner;

public class ExercicioRevisao2 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um n�mero inteiro:");
		int numero = sc.nextInt();
		
		if(numero<0) {
			System.out.println("N�mero � negativo.");
		} else if(numero>0) {
			System.out.println("N�mero � positivo.");
		} else {
			System.out.println("O n�mero � zero.");
		}
	
		
	}
	
}
