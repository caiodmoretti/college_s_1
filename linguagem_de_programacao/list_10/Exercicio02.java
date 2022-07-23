package Lista_10;
/*
 02. Implemente uma função que receba como parâmetro um vetor de números inteiros e inverta a ordem dos elementos
armazenados nesse vetor.
 * */
import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {
		final int TAMANHO_VETOR = 20;
		int vetor_a[] = new int[TAMANHO_VETOR];
		
		preencher_vetor_a(vetor_a, TAMANHO_VETOR);
		System.out.println("\nConfira o vetor inicial: ");
		imprimir_vetor_a(vetor_a, TAMANHO_VETOR);
		inverter_vetor_a(vetor_a, TAMANHO_VETOR);
		System.out.println("\nConfira o vetor invertido: ");
		imprimir_vetor_a(vetor_a, TAMANHO_VETOR);
	}
	static void preencher_vetor_a(int vetor_a[], int TAMANHO_VETOR) {
		Random entrada_aleatoria = new Random();
		for(int indice_do_vetor = 0; indice_do_vetor<TAMANHO_VETOR; indice_do_vetor++) {
			vetor_a[indice_do_vetor] = entrada_aleatoria.nextInt(100);
		}
	}
	static void inverter_vetor_a(int vetor_a[],int TAMANHO_VETOR) {
		int vetor_b[] = new int[TAMANHO_VETOR];
		for(int indice_do_vetor = 0; indice_do_vetor<TAMANHO_VETOR; indice_do_vetor++) {
			vetor_b[((TAMANHO_VETOR-1)-indice_do_vetor)] = vetor_a[indice_do_vetor];
		}
		for(int indice_do_vetor = 0; indice_do_vetor<TAMANHO_VETOR; indice_do_vetor++) {
			vetor_a[indice_do_vetor] = vetor_b[indice_do_vetor];
		}
	}
	static void imprimir_vetor_a(int vetor_a[], int TAMANHO_VETOR) {
		for(int indice_do_vetor = 0; indice_do_vetor<TAMANHO_VETOR; indice_do_vetor++) {
			System.out.print(vetor_a[indice_do_vetor] + " ");
		}
	}

}
