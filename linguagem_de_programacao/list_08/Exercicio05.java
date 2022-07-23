/*
5.Criar um programa que entre com elementos para uma matriz tridimensional inteira com dimensões 5x4x2.
Imprima a matriz em dois passos: primeiro a profundidade 0 e depois a profundidade 1.
 * */

package Lista_08;
import java.util.Random;
public class Exercicio05 {

	public static void main(String[] args) {
		int matriz_a[][][] = new int [5][4][2];
		int linha, coluna, profundidade;
		Random numero_aleatorio = new Random();
		//Construção da matriz a.
		for(linha = 0; linha < 5; linha++) {
			for(coluna = 0; coluna< 4; coluna++) {
				for(profundidade = 0; profundidade < 2; profundidade++) {
					matriz_a[linha][coluna][profundidade] = numero_aleatorio.nextInt(100);
				}
			}
		}
		for(profundidade = 0; profundidade < 2; profundidade++) {
			System.out.println("Confira os dados da profundidade " + profundidade + ":");

			for(coluna = 0; coluna< 4; coluna++) {
				for(linha = 0; linha < 5; linha++) {
					System.out.print(matriz_a[linha][coluna][profundidade] + " ");
				}
				System.out.println();
			}
		}
	}

}
