/*Exercício 06

Prepare um programa para ler o nome e a idade de 30 pessoas. Após a leitura dos dados o programa deverá informar o nome de todas as pessoas que ficarem acima da média de idades.
*/
import java.util.Scanner;

class Exercicio06 {
  public static void main(String[] args) {

	Scanner entradaPeloTeclado = new Scanner(System.in);      
    int vetor_idade[] = new int[30];
    String vetor_nome[] = new String[30];
    int posicao_idade = 0, posicao_nome;
    double soma_idades = 0;

    System.out.println("Entre com o nome e idade de 30 pessoas e descubra quem tem idade acima da média!");
    // Construção do array de nomes.
    for (posicao_nome = 0; posicao_nome < 30; posicao_nome++) {
	System.out.println("Informe o nome da pessoa: ");
	vetor_nome[posicao_nome] = entradaPeloTeclado.nextLine();
 
    // Construção do array de idades.   
    System.out.println("Informe a idade da pessoa: ");
    vetor_idade[posicao_idade] = entradaPeloTeclado.nextInt();
    soma_idades = soma_idades + vetor_idade[posicao_idade];
    posicao_idade++;
	entradaPeloTeclado.nextLine();//Limpar o Buffer de Teclado
		}

    System.out.println("A média das idades informadas é: " + (soma_idades/vetor_idade.length));  
        
    System.out.println("Essas pessoas tem idade acima da média: ");
      
       for (posicao_idade = 0; posicao_idade < 30; posicao_idade++) {
        if(vetor_idade[posicao_idade] > (soma_idades/vetor_idade.length) ){
        System.out.println(vetor_nome[posicao_idade]);        
        }
      }
 }
}