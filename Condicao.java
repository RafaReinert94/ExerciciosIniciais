
import java.util.Scanner;

public class Condicao {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite a opcao desejada:");		
		System.out.println("1 - Somar");		
		System.out.println("2 - Subtracao");
		System.out.println("3 - Multiplicacao");
		System.out.println("4 - Divisao");


		int operacao = sc.nextInt();


		System.out.println("Digite um numero");
		double numero1 = sc.nextDouble();
		System.out.println("Digite um numero");
		double numero2 = sc.nextDouble();

			if(operacao == 1){
			System.out.println("A soma entre os dois e: " + (numero1 + numero2));
			}

			if(operacao == 2){
			System.out.println("A subtracao entre os dois e: " + (numero1-numero2));
			}

			if(operacao == 3){
			System.out.println("A multiplicacao entre os dois e: " + (numero1*numero2));
			}

			if(operacao == 4){
			System.out.println("A divisao entre os dois e: " + (numero1/numero2));
			}
	 
			
		sc.close();

	}
}