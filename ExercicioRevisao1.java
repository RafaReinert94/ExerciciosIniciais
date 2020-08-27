package src;

import java.util.Scanner;

public class ExercicioRevisao1 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número inteiro:");
		int numero = sc.nextInt();
		
		String tipoNumero = numero < 0 ? "Numero é negativo." : "Numero é positivo.";
		
		System.out.println(tipoNumero);
		
				
	}
	
	
}
