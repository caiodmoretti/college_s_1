/*Exercício 04

Ler um vetor com 50 números. Informar a posição em que está o maior número. Se o maior número existir mais
de uma vez, informe todas as posições onde existir este número.
*/
import java.util.Scanner;

class Exercicio04 {
  public static void main(String[] args) {

	Scanner entradaPeloTeclado = new Scanner(System.in);      
    Double vetor_numeros[] = new Double[50];
    Double maior_numero = Double.MIN_VALUE;
    int posicao_numero;

    for (posicao_numero = 0; posicao_numero < 50; posicao_numero++) {
	System.out.printf("\nEntre com um número para a posição %d: ", posicao_numero);
	vetor_numeros[posicao_numero] = entradaPeloTeclado.nextDouble();
    if (vetor_numeros[posicao_numero] > maior_numero){
        maior_numero = vetor_numeros[posicao_numero];
    }
		}
  

	for (posicao_numero = 0; posicao_numero < 50; posicao_numero++) {
			if (vetor_numeros[posicao_numero].equals(maior_numero)) {
			    System.out.println("O número " + vetor_numeros[posicao_numero] + " é o maior.");
                System.out.println("Ele está na posição " + posicao_numero + " do vetor.");

			}
		}
        
    
  }
}