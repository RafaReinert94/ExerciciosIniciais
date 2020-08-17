package e21.api;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		boolean rep = true;
		
		while(rep) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Cadastro:");
		System.out.println("");
		
		System.out.println("Digite seu nome:");
		String nome = sc.next();
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		System.out.println("Gostou do menu do cadastro? (S/N)");
		String resp = sc.next();
		
		
		
		
		
		System.out.println("Seu nome é " + nome + ".");
		
		String mensagem = resp.equalsIgnoreCase("S") ? "Que bom que gostou do nosso cadastro." : 
			"Estamos melhorando o nosso cadastro.";;
		System.out.println(mensagem);
		 
		if(idade < 18 ) {
			System.out.println("Você ainda nao pode beber.");
		} else {
			System.out.println("Você já pode beber com moderação.");
		}
		
		
		
		System.out.println("Deseja cadastrar mais alguem? (S/N)");
		String loop = sc.next();
		
		 if(loop.equalsIgnoreCase("S")) {
			 rep = true;
		 } else {
			 System.out.println("Obrigado por usar nosso sistema.");
			 rep = false;
			 sc.close();
		}
		}
	}
}
