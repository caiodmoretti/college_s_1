/*Exercício 05
Prepare um programa para perguntar o nome e o sexo de 200 pessoas. Você deve listar primeiro o nome de todas
as mulheres e depois o nome de todos os homens.
*/
import java.util.Scanner;

class Exercicio05 {
  public static void main(String[] args) {

	Scanner entradaPeloTeclado = new Scanner(System.in);      
    String vetor_sexo_nome[] = new String[400];

    int posicao_nome;


	System.out.println("Crie um vetor com sexo e nome de 200 pessoas!");      
    // Construção do array
    // O valor de 400 foi usado pois para cada pessoa é necessário incluir dois valores: sexo e nome
    for (posicao_nome = 0; posicao_nome < 400; posicao_nome++) {
	System.out.println("Informe o sexo da pessoa [M ou F]: ");
	vetor_sexo_nome[posicao_nome] = entradaPeloTeclado.nextLine();
    posicao_nome++;
    System.out.println("Informe o nome da pessoa: ");
    vetor_sexo_nome[posicao_nome] = entradaPeloTeclado.nextLine();

		}

    // Impressão das mulheres
    System.out.println("\nAs mulheres da lista são: ");
    for (posicao_nome = 0; posicao_nome < 400; posicao_nome++) {
    
        if(vetor_sexo_nome[posicao_nome].equals("F")){
        System.out.println(vetor_sexo_nome[posicao_nome+1]);
        }
    
    }
    System.out.println("\nOs homens da lista são: ");
    // Impressão dos homens
    for (posicao_nome = 0; posicao_nome < 400; posicao_nome++) {
    
        if(vetor_sexo_nome[posicao_nome].equals("M")){
        System.out.println(vetor_sexo_nome[posicao_nome+1]);
        }
  }
 }
}