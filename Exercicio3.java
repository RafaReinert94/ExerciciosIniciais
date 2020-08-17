package e21.api;

import java.util.Scanner;

public class Exercicio3 {

			public static void main(String[] args) {
			//declaração do método principal, o que sera invocado ao executar a classe
			 Scanner sc = new Scanner(System.in);
			 //Uma funçao que vai ler a tela do console 
			 System.out.println( "Qual seu genero?" );
			 //vai printar na telo o que esta escrito entre os parenteses
			 System.out.println( "M - Masculino " );
			 System.out.println( "F - Feminino" );
			 
			 String genero = sc.next();
			 //gravar na variavel genero o que eu escrevi no console
			 if(genero.equalsIgnoreCase("M")) {
				 //equalsIgnoreCase vai ignorar se a letra é minuscula ou maiuscula
				 System.out.println ("Bem Vindo");
			 } else if(genero.equalsIgnoreCase("F")) {
				 System.out.println ("Bem Vinda");
			 } else {
				 System.out.println ("Bem Vindx");
			 }
			 
			 sc.close();
			 
			 
			 
//			 System.out.println( "1 - Masculino " );
//			 System.out.println( "2 - Feminino" );
//			 int genero = sc.nextInt();
//			 			 
//			 switch (genero) {
//			   case 1:
//			           System.out.println ("Bem Vindo");
//			           break;
//
//			   case 2:
//			           System.out.println ("Bem Vinda");
//			           break;
//
//			  default:
//			           System.out.println ("Bem Vindxs");
			//}
			 
			 //sc.close();
		 }
	
}
