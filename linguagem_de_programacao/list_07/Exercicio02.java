/*Exercício 02
Faça um programa que leia 20 elementos de um vetor A e construa um vetor B com os mesmos elementos de A,
sendo que estes deverão estar invertidos, ou seja, o primeiro elemento de A passa a ser o último de B, o segundo de A passa a ser o penúltimo de B e assim por diante.
*/
import java.util.Scanner;

class Exercicio02 {
  public static void main(String[] args) {

	Scanner entradaPeloTeclado = new Scanner(System.in);      

    int posicao_a = 0, posicao_b = 0;
 

    int vetor_a[] = new int[20];
    int vetor_b[] = new int[20];

      
    // Construção do array a.
    for (posicao_a = 0, posicao_b = 19; posicao_a < 20; posicao_a++, posicao_b--) {
	System.out.println("Informe o elemento " + posicao_a + " do vetor A: ");
	vetor_a[posicao_a] = entradaPeloTeclado.nextInt();
 
    // Construção do array b.   
	vetor_b[posicao_b] = vetor_a[posicao_a];
        
		}

	System.out.println("Verifique o conteúdo dos vetores.");
//Repetição para mostrar o conteúdo dos vetores a e b.
        for (posicao_a = 0, posicao_b = 19; posicao_a < 20 ; posicao_a++, posicao_b--) {
	        System.out.println("Vetor A - Posição " + posicao_a + " - Valor: " + vetor_a[posicao_a]  );
            System.out.println("Vetor B - Posição " + posicao_b + " - Valor: " + vetor_b[posicao_b]  );
     }
  }
}

