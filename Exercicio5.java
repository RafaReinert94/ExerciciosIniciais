package src;

import java.util.Date;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu ano de nascimento:");
		int ano = sc.nextInt();
		int anoatual = 2020;
		
		if(anoatual - ano < 16) {
			System.out.println("Voc� n�o pode votar.");
		} else {
			System.out.println("Voc� pode votar.");
		}
		
		sc.close();
	}

}
