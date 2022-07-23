/*
3.Faça um programa para criar uma matriz de dimensões 4x4 do tipo char. Inicialize todas as posições da matriz
com a letra x. Em seguida dois caracteres y deverão ser inseridos na matriz em posições aleatórias sem que
o usuário saiba onde. Crie uma repetição para permitir ao usuário entrar com coordenadas da matriz visando
acertar em quais posições da matriz foram colocados os caracteres y. Quando um y for localizado informe ao
usuário que ele acertou. Ao final informe o número de tentativas que foram necessárias para descobrir as posições
dos caracteres y.
 * */

package Lista_08;
import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entradaPeloTeclado = new Scanner(System.in);
		char matriz_a [][] = new char [4][4];
		char matriz_guia[][] = new char [4][4];
		int linha, coluna, tentativas = 0, acertos = 0, numero_de_y = 0;
		boolean vitoria = false;
		Random numero_aleatorio = new Random();
		//Preenchendo a matriz_a com a letra 'x'.
		for(linha = 0; linha < 4; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				matriz_a[linha][coluna] = 'x';
			}
		}
		//Preenchendo a matriz_guia com o caracter '?'.
		for(linha = 0; linha < 4; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				matriz_guia[linha][coluna] = '?';
			}
		}
		
		//Colocando a letra 'y' em 2 posições aleatórias.
		for(int contador = 0; contador < 2 && numero_de_y < 2; contador++) {
			matriz_a[numero_aleatorio.nextInt(4)][numero_aleatorio.nextInt(4)] = 'y';
			matriz_a[numero_aleatorio.nextInt(4)][numero_aleatorio.nextInt(4)] = 'y';
			
			for(linha = 0; linha < 4; linha++) {
				for(coluna = 0; coluna < 4; coluna++) {
					if(matriz_a[linha][coluna] == 'y')
						{ numero_de_y++;}	
					}
				}
			}

		/*Impressão da matriz para testar a quantidade de y:	
		System.out.println("Confira se a matriz está com 2 'y':");		
		for(linha = 0; linha < 4; linha++) {
				for(coluna = 0; coluna < 4; coluna++) {
				System.out.print(matriz_a[linha][coluna] + " ");
					}
				System.out.println();
				}	*/



		System.out.println("Tente encontrar os 2 'y' escondidos na matriz!");
		for(linha = 0; linha < 4; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
				System.out.print(matriz_guia[linha][coluna] + " ") ;
			}
			System.out.println();
		}
		//Estrutura para o usuário tentar encontrar o 'y'.	
		while(vitoria == false) {
		System.out.println("Informe em qual linha você quer verificar:");
		linha = entradaPeloTeclado.nextInt();
		System.out.println("Informe em qual coluna você quer verificar:");
		coluna = entradaPeloTeclado.nextInt();
		tentativas++;

		if(matriz_a[linha][coluna] == 'y') {
		System.out.println("Você encontrou o y!");
		matriz_guia[linha][coluna] = 'y';
		acertos++;
		//Estrutura para exibir as tentativas.
		for(linha = 0; linha < 4; linha++) {
			for(coluna = 0; coluna < 4; coluna++) {
			System.out.print(matriz_guia[linha][coluna] + " ");
				}
			System.out.println();
			}
		if(acertos == 2) {
			vitoria = true;
			System.out.println("Você precisou de " + tentativas + " tentativas.");		
		}
		}
		else {
			matriz_guia[linha][coluna] = 'x';
			System.out.println("Tente novamente.");
			//Estrutura para exibir as tentativas.
			for(linha = 0; linha < 4; linha++) {
				for(coluna = 0; coluna < 4; coluna++) {
				System.out.print(matriz_guia[linha][coluna] + " ");
					}
				System.out.println();
				}
			}
		
		}
		//Impressão da matriz.	
		System.out.println("Confira como era a matriz:");		
		for(linha = 0; linha < 4; linha++) {
				for(coluna = 0; coluna < 4; coluna++) {
				System.out.print(matriz_a[linha][coluna] + " ");
					}
				System.out.println();
				}	

	}
}
	

