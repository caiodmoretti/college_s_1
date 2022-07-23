package Lista_10;
/*
01.Implemente uma função que receba como parâmetro um vetor de números reais e retorne quantos números
negativos estão armazenados nesse vetor.
 * */

public class Exercicio01 {
	
	public static void main(String[] args) {		
		final int TAMANHO_VETOR = 20;
		Double vetor_a[] = new Double[TAMANHO_VETOR];
		int quantidade_de_negativos = 0;
		
		preencher_vetor(vetor_a,TAMANHO_VETOR);
		quantidade_de_negativos = contar_negativos(vetor_a,TAMANHO_VETOR);
		imprimir_quantidade_de_negativos(quantidade_de_negativos);

	}
	static void preencher_vetor(Double vetor_a[], int TAMANHO_VETOR) {
		double min = -10;
		double max = 10;
		double numero_aleatorio;
		for (int contador = 0; contador < TAMANHO_VETOR; contador++) {
			numero_aleatorio = (double)Math.floor(Math.random()*(max-min+1)+min);
			vetor_a[contador] = numero_aleatorio;
		}
	}
	static int contar_negativos(Double vetor_a[], int TAMANHO_VETOR) {
		int quantidade_de_negativos = 0;
		for (int contador = 0; contador < TAMANHO_VETOR; contador++) {
			if(vetor_a[contador] < 0) {
				quantidade_de_negativos++;
			}
		}
		return quantidade_de_negativos;
	}
	static void imprimir_quantidade_de_negativos(int quantidade_de_negativos) {
		System.out.print("Foram encontrados " + quantidade_de_negativos + " números negativos.");
	}
}


