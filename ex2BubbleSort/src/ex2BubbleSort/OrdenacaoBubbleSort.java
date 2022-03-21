/**
 * Classe criada para ordenar de maneira crescente um vetor.
 * @author Bruno Reis
 */

package ex2BubbleSort;

public class OrdenacaoBubbleSort {

	public static void main(String[] args) {

		int vetor[] = { 3, 6, 2, 1, 8, 4 };
		int aux;
		boolean controle;

		for (int i = 0; i < vetor.length; ++i) {
			controle = true;
			for (int j = 0; j < (vetor.length - 1); ++j) {

				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
			}
			if (controle) {
				break;
			}

		}

		for (int i = 0; i < vetor.length; ++i) {
			System.out.print(vetor[i] + " ");
		}

	}
}