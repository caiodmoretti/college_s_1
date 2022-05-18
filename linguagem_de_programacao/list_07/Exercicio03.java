/*Exercício 03

Prepare um programa para ler um vetor com 200 números. Depois desta leitura você deve calcular a média destes números. Seu programa deverá informar a posição e o valor de todos os números que ficaram acima desta média.
*/
import java.util.Scanner;

class Exercicio03 {
  public static void main(String[] args) {

	Scanner entradaPeloTeclado = new Scanner(System.in);      
    Double vetor_numeros[] = new Double[200];
    int posicao_numero;
    double soma_numeros = 0;

    for (posicao_numero = 0; posicao_numero < 200; posicao_numero++) {
	System.out.printf("\nEntre com um número para a posição %d: ", posicao_numero);
	vetor_numeros[posicao_numero] = entradaPeloTeclado.nextDouble();
    soma_numeros = (vetor_numeros[posicao_numero] + soma_numeros);
		}

    System.out.println("A média dos números informados é: " + (soma_numeros/20));  

	for (posicao_numero = 0; posicao_numero < 200; posicao_numero++) {
			if (vetor_numeros[posicao_numero] > (soma_numeros/200)) {
			System.out.println("O número " + vetor_numeros[posicao_numero] + " que está na posição " + posicao_numero + " é maior que a média do vetor.");				
			}
		}
        
    
  }
}