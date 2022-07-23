package Lista_10;
/*
04.Faça uma função para receber um vetor de números inteiros e ordenar o vetor em ordem decrescente. 
Faça um programa principal para testar a função e imprimir o resultado do processamento.
 */

import java.util.Random;
public class Exercicio04 {

	public static void main(String[] args) {
		final int TAMANHO_VETOR = 25;
		int vetor_aleatorio[] = new int[TAMANHO_VETOR];
		
		preencher_vetor(vetor_aleatorio,TAMANHO_VETOR);
		System.out.println("\nVetor gerado: ");
		imprimir_vetor(vetor_aleatorio,TAMANHO_VETOR);
		
		ordenar_vetor(vetor_aleatorio,TAMANHO_VETOR);
		System.out.println("\nVetor ordenado: ");
		imprimir_vetor(vetor_aleatorio, TAMANHO_VETOR);
	}
	static void preencher_vetor(int vetor_aleatorio [],int TAMANHO_VETOR) {
		Random entrada_aleatoria = new Random();
		for(int indice_vetor = 0; indice_vetor<TAMANHO_VETOR; indice_vetor++) {
			vetor_aleatorio[indice_vetor] = entrada_aleatoria.nextInt(100);
		}
	}
	static void ordenar_vetor(int vetor_inteiros [], int TAMANHO_VETOR) {
		int indice_deslocamento, indice_busca, auxiliar;
		for (indice_deslocamento = 0; indice_deslocamento < (TAMANHO_VETOR-1); indice_deslocamento++) {
			for (indice_busca = indice_deslocamento + 1; indice_busca < TAMANHO_VETOR; indice_busca++) {
				if (vetor_inteiros[indice_deslocamento] > vetor_inteiros[indice_busca]) {
					auxiliar = vetor_inteiros[indice_deslocamento];
					vetor_inteiros[indice_deslocamento] = vetor_inteiros[indice_busca];
					vetor_inteiros[indice_busca] = auxiliar;
			    }
			}
		}
	}
	static void imprimir_vetor(int vetor_aleatorio[], int TAMANHO_VETOR) {
		for(int indice_vetor = 0; indice_vetor<TAMANHO_VETOR; indice_vetor++) {
			System.out.print(vetor_aleatorio[indice_vetor] + " ");
		}
	}
}
