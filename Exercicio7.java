package src;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas ma��s voc� deseja?");
		int qtdade = sc.nextInt();
		
		if(qtdade<12) {
			System.out.println("O valor total � de: " + (qtdade*0.30));
		} else {
			System.out.println("O valor total � de: " + (qtdade*0.25));
		}
		sc.close();
	}

}
