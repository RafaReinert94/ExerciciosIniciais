package e21.api;

//importa o scanner de dados, para que este possa ser usado
import java.util.Scanner;

/*
* Funcionamento do bloco 'while'
*/
public class Exercicio6{//declaraÃ§Ã£o da classe
	
	public static void main(String[] args) {//declaraÃ§Ã£o do mÃ©todo principal, o que serÃ¡ invocado ao executar a classe
		//inicia a variavel de leitura de entrada de escrita
		Scanner sc = new Scanner(System.in);		
		//escrevendo um texto
		System.out.println("Quer tentar adivinhar um numero de 1 a 10? S/N");
		//pegando o valor da resposta
		String resposta = sc.next();

		//cria e inicializa a variÃ¡vel
		boolean repetir = false;//porque a inicializo aqui?
		if(resposta.equalsIgnoreCase("S")) {//testo se a responsta Ã© igual a 'S', caso verdadeito... executa o bloco
			repetir = true;//repetir recebe verdadeiro
		}

		//o bloco acima tambÃ©m pode ser feito dessa maneira:
		//.equalsIgnoreCase retorna 'true' ou 'false', entÃ£o se a resposta for igual a 'S' a variÃ¡vel repetir recebe 'true', caso contrÃ¡rio recebe 'false' 
		//boolean repetir = resposta.equalsIgnoreCase("S");

		//iniciando o bloco while, se o valor entre parentesis for 'verdadeiro', ele sempre irÃ¡ executar novamente o conteÃºdo do bloco
		while(repetir) {
			//escrevendo texto
			System.out.println("Digite seu numero:");
			//recolhendo uma resposta
			int numero = sc.nextInt();

			//testando se o nÃºmero Ã© diferente de 6
			if(numero == 6) {
				//escrevendo texto
				System.out.println("Acertou :)");
				//se a pessoa acertou a resposta, o valor dessa variÃ¡vel vai receber 'false',
				//pois nÃ£o faz mais sentido continuar perguntando
				repetir = false;
			} else {
				//escrevendo texto
				System.out.println("Errou :(");
				//escrevendo texto
				System.out.println("Deseja tentar novamente? S/N");
				//pegando a resposta em texto
				resposta = sc.next();
				//verificando se deve repetir
				repetir = resposta.equalsIgnoreCase("S");
			}
			
		} //enquanto precisa repetir a ordem, este bloco executa

		//fecha o scanner
		sc.close();
	}
}