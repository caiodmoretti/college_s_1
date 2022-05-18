/*Exercício 01

Prepare um programa para ler o nome de 50 pessoas e listá-los na ordem inversa de entrada.

*/
import java.util.Scanner;

class Exercicio01 {
  public static void main(String[] args) {

	Scanner entradaPeloTeclado = new Scanner(System.in);      
    String vetorNomes[] = new String[50];
    int posicao_nome;

    for (posicao_nome = 0; posicao_nome < 50; posicao_nome++) {
	System.out.printf("\nEntre com um nome para a posição %d: ", posicao_nome);
	vetorNomes[posicao_nome] = entradaPeloTeclado.nextLine();		
		}

	for (posicao_nome = 49; posicao_nome >= 0 ; posicao_nome--) {
			System.out.println(vetorNomes[posicao_nome]);
		}    

  }
}