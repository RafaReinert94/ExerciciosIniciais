package e21.api;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Scanner sc = new Scanner (System.in);
        
        String nome = "Indefinido";
        
        try {
			
        	System.out.println( "Escreva seu nome:" );
        	nome = sc.next();
        	
		} catch (Exception e) {
			// TODO: handle exception
	
			
		} finally {
			sc.close();
		}
        System.out.println( "Seu nome é: " + nome );
    }
}
