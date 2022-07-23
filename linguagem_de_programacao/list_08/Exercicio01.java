/*
 1. Faça um programa para ler duas matrizes A e B, cada uma de duas dimensões com 5 linhas e 3 colunas. Construir
uma matriz C de mesma dimensão, onde C é formada pela soma dos elementos da matriz A com os elementos
da matriz B.
 * */

package Lista_08;
import java.util.Random;

public class Exercicio01 {
	public static void main(String[] args) {
		int matriz_A[][] = new int[5][3];
		int matriz_B[][] = new int[5][3];
		int matriz_C[][] = new int[5][3];
		int linha, coluna;
		Random numero_aleatorio = new Random();
			//Construção das matrizes A e B. 
		for(linha = 0; linha <5; linha ++ ) {	
			for(coluna = 0; coluna < 3; coluna++){
				matriz_A[linha][coluna] = numero_aleatorio.nextInt(100);
				matriz_B[linha][coluna] = numero_aleatorio.nextInt(100);
			}
		}
			//Construção da matriz C. 
		for(linha = 0; linha <5; linha ++ ) {	
			for(coluna = 0; coluna < 3; coluna++){
				matriz_C[linha][coluna] = (matriz_A[linha][coluna] + matriz_B[linha][coluna]);
			}
		}		
		System.out.println("Confira o conteúdo das matrizes!");		
		System.out.println("Confira a matriz A:");
		for(linha = 0; linha <5; linha ++ ) {
			for(coluna = 0; coluna < 3; coluna++){
				System.out.print(matriz_A[linha][coluna] + " ");
			}
			System.out.println();
		}		
		System.out.println("Confira a matriz B:");
		for(linha = 0; linha <5; linha ++ ) {
			for(coluna = 0; coluna < 3; coluna++){
				System.out.print(matriz_B[linha][coluna] + " ");
			}
			System.out.println();
		}		
		System.out.println("Confira a matriz C:");
		for(linha = 0; linha <5; linha ++ ) {
			for(coluna = 0; coluna < 3; coluna++){
				System.out.print(matriz_C[linha][coluna] + " ");
			}
			System.out.println();
		}	
	}
}