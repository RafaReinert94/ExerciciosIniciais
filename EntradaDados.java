
import java.util.Scanner;


public class EntradaDados {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		double numero1 = sc.nextDouble();
		System.out.println("Digite um numero");
		double numero2 = sc.nextDouble();
		System.out.println("A soma entre os dois e: " + (numero1 + numero2));	
		System.out.println("A subtracao entre os dois e: " + (numero1-numero2));
		System.out.println("A multiplicacao entre os dois e: " + (numero1*numero2));
		System.out.println("A divisao entre os dois e: " + (numero1/numero2));
		sc.close();

	}
}