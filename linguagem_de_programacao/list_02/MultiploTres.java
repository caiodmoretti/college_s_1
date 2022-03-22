/* Exercício 06
Programa para verificar para se número inteiro é par ou ímpar.
O número deverá ser lido pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class MultiploTres {
  public static void main(String[] args) {
    double numero; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );
      System.out.println("Descubra se um número é múltiplo de 3!");
      System.out.println("Informe um número.");
      numero = leia.nextDouble();
      
      
    if (numero % 3 == 0)
    {
        System.out.println("O número informado é múltiplo de 3.");
    }
      else{
        
          System.out.println("O número informado não é múltiplo de 3.");
    }
  }
}