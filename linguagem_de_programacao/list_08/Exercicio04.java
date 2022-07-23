/*
4.4. Criar um programa que possa armazenar em uma matriz as alturas de dez atletas de cinco delega��es que
participar�o dos jogos de ver�o. Imprimir a maior altura de cada delega��o.
 * */

package Lista_08;

import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		
		double altura, maior_altura = Double.MIN_VALUE;
		int linha, coluna, delegacoes = 5, jogadores = 10 ;
		double matriz_alturas[][] = new double [jogadores][delegacoes];
		
		//Estrutura para adicionar as alturas na matriz.
		for(coluna = 0; coluna < delegacoes; coluna++) {
			System.out.println("Entre com as infora��es da delega��o " + coluna + ":");
			for(linha = 0; linha<jogadores;linha++) {
				System.out.println("Informe a altura do jogador " + linha + ":");
				altura = entradaPeloTeclado.nextDouble();
				matriz_alturas[linha][coluna] = altura;
			}
		}
		//Estrutura para determinar a maior altura por delega��o.
		for(coluna = 0; coluna < delegacoes; coluna++){
			for(linha = 0; linha<jogadores;linha++){
				if(matriz_alturas[linha][coluna] > maior_altura) {
					maior_altura = (matriz_alturas[linha][coluna]);
				};
			}
			//Impress�o das maiores alturas.
			System.out.println("A maior altura da delega��o " + coluna + " �: " + maior_altura );
			maior_altura = 0;
		}		
		
	}

}
