package e21.api;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);

		 System.out.println( "Oi tudo bem? S/N" );



		 String resposta = sc.next();

		 String textoExibicao = resposta.equalsIgnoreCase("S") ? "Fico feliz por você" :
			 resposta.equalsIgnoreCase("N") ? "Espero que melhore" : "Voce digitou errado";;
		
		 System.out.println(textoExibicao);
		 
		 sc.close();		
		
	
		 
		}
	
	
}
