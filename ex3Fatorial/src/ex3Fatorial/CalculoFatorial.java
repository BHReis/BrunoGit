/**
 * Classe criada para calcular o vetorial de um numero digitado.
 * @author Bruno Reis
 */


package ex3Fatorial;

import java.util.Scanner;

public class CalculoFatorial {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero para saber o Fatorial: ");
		int numeroEscolhido = ler.nextInt();
		int vetorial = 1;
		int contador = numeroEscolhido;
		
		while (contador >=1 ) {
			
			vetorial *= contador;

			contador--;
			
		}
		
		System.out.println(numeroEscolhido+"! = " + vetorial);
	}

}
