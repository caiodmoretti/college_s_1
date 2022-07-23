/*
 Faça um programa para ler dois vetores A e B com 7 elementos. Construir uma matriz C de duas dimensões,
onde a primeira coluna deverá ser formada pelos elementos do vetor A e a segunda pelos elementos do vetor B. */

package Lista_08;

import java.util.Random;

public class Exercicio02 {
public static void main(String[] args) {
		int vetor_a [] = new int [7];
		int vetor_b [] = new int [7];
		int matriz_c [][] = new int [7][2];
		int linha, coluna;
		Random numero_aleatorio = new Random();
		//Construção dos vetores a e b.
		for(linha = 0; linha < 7; linha++) {
			vetor_a[linha] = numero_aleatorio.nextInt(1000);
			vetor_b[linha] = numero_aleatorio.nextInt(1000);
		}
	
		//Construção da matriz c.		
		for(linha = 0; linha < 7; linha++) {
				matriz_c[linha][0] = vetor_a[linha];
				matriz_c[linha][1] = vetor_b[linha];
			}
				System.out.println("Confira o conteúdo dos vetores A e B e da matriz C!");		
				System.out.println("Vetor A:");				for(linha = 0; linha <7; linha ++ ) {
					System.out.println( vetor_a[linha] + " ");
				}
				System.out.println("Vetor B:");				for(linha = 0; linha <7; linha ++ ) {
					System.out.println( vetor_b[linha] + " ");
				}
				System.out.println("Matriz C :");
				for(linha = 0; linha < 7; linha++){
					for(coluna = 0; coluna<2; coluna++) {
					System.out.print(matriz_c[linha][coluna] + " ");
						}
					System.out.println();
				}

	}
}
