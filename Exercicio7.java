package src;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maçãs você deseja?");
		int qtdade = sc.nextInt();
		
		if(qtdade<12) {
			System.out.println("O valor total é de: " + (qtdade*0.30));
		} else {
			System.out.println("O valor total é de: " + (qtdade*0.25));
		}
		sc.close();
	}

}
