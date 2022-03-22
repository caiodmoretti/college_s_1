/* Exercício 05
Programa para verificar para se número inteiro é par ou ímpar.
O número deverá ser lido pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class ParImpar {
  public static void main(String[] args) {
    int numero; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );
      System.out.println("Descubra se um número inteiro é par ou ímpar!");
      System.out.println("Informe um número inteiro.");
      numero = leia.nextInt();
      
    if (numero % 2 == 0)
    {
        System.out.println("O número informado é par.");
    }
      else{
        
          System.out.println("O número informado é ímpar.");
    }
  }
}