
import java.util.Scanner;


public class Media {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Media de quatro numeros");
		System.out.println("Digite um numero");
		double numero1 = sc.nextDouble();
		System.out.println("Digite um numero");
		double numero2 = sc.nextDouble();
		System.out.println("Digite um numero");
		double numero3 = sc.nextDouble();
		System.out.println("Digite um numero");
		double numero4 = sc.nextDouble();
		System.out.println("A media aritmetica dos quatro numeros e: " + ((numero1 + numero2 + numero3 + numero4)/4));	

		sc.close();

	}
}