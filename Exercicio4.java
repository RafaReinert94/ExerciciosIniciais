package e21.api;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);

	 System.out.println( "Selecione um animal:" );

	 System.out.println( "1 - Dog " );
	 System.out.println( "2 - Cat" );
	 System.out.println( "3 - Cow" );

	 int animal = sc.nextInt();
	 			 
	 switch (animal) {
	   case 1:
	           System.out.println ("AuAuAuAu");
	           break;

	   case 2:
	           System.out.println ("Miau");
	           break;
	           
	   case 3:
		   	   System.out.println ("Muuuuu");
		   	   break;
           
	  default:
	           System.out.println ("Número invalido.");
	}
	 
	 sc.close();
	
	}
}
