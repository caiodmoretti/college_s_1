/*Exercício 07
Prepare um programa para ler dois vetores, um com o preço e o outro com a quantidade vendida de 500 produtos.
Seu programa deverá informar:
(a) O valor arrecadado com cada produto
(b) O valor total arrecadado
*/
import java.util.Scanner;

class Exercicio07 {
  public static void main(String[] args) {

	Scanner entradaPeloTeclado = new Scanner(System.in);      
    int vetor_quantidade[] = new int[500];
    double vetor_preco[] = new double[500];
    int posicao_quantidade = 0, posicao_preco;
    double soma_produtos = 0, soma_total = 0;

    System.out.println("Hora de conferir seus resultados!");
    System.out.println("Verifique quanto foi o valor arrecadado de suas vendas. Para isso informe o valor de cada produto e na sequência a quantidade que foi vendida.");
      
    // Construção do array de preços.
    for (posicao_preco = 0; posicao_preco < 500; posicao_preco++) {
	System.out.println("Informe o preço do produto: ");
	vetor_preco[posicao_preco] = entradaPeloTeclado.nextDouble();
 
    // Construção do array de quantidades.   
    System.out.println("Informe a quantidade vendida: ");
    vetor_quantidade[posicao_quantidade] = entradaPeloTeclado.nextInt();
    
    posicao_quantidade++;
		}


//Repetição para gerar valor arrecadado para cada produto.
       for (posicao_quantidade = 0; posicao_quantidade < 500; posicao_quantidade++) {
        System.out.println("O valor arrecado com o produto " + posicao_quantidade + " foi R$" + (vetor_quantidade[posicao_quantidade] * vetor_preco[posicao_quantidade]));
           
        soma_total = (soma_total +  (vetor_quantidade[posicao_quantidade] * vetor_preco[posicao_quantidade]));
           
      }
        System.out.println("O valor arrecado com todas as vendas foi R$"+ soma_total );
 }
}