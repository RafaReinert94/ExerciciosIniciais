package e21.api;

import java.util.Scanner;

public class Exercicio2 {

	 public static void main(String[] args) {
	 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println( "Escreva seu nome:" );
		 String nome = sc.next();
		 
		 System.out.println( "Escreva sua idade:" );
		 int idade = sc.nextInt();
		 
		 if(idade<18) {
			 System.out.println( nome +" é menor de idade." );
		 } else {
			 System.out.println( nome +" é maior de idade." );
		 }
		 sc.close();
	 }
	
}
