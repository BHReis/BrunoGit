/**
 * Classe criada para calcular a soma dos valores multiplos por 3 ou 5 com base em um número escolhido.
 * @author Bruno Reis
 */



package ex4SomaMultiplos;

import java.util.Scanner;

public class SomaMultiplo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.printf("Digite um valor: ");		
		int a = ler.nextInt();
		int b = 0;
		
		while (a>0) {
			if(a % 3 == 0 || a % 5 ==0) {
				b += a;
				a--;
			}
			else {
				a--;
			}
		}
		System.out.println("Soma dos numeros multiplos por 3 ou 5: " + b);
	}

}
