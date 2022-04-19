/* Exercício 04
Programa para inverter o valor de duas variáveis.
As variáveis deverão ser lidas pelo teclado. O usuário deverá informar as duas variáveis.
Após a leitura, a inversão deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class Troca {
  public static void main(String[] args) {
    double variavel_01, variavel_02, troca; // Declaração de variáveis
    Scanner leia = new Scanner ( System.in );
      
      System.out.println("Informe o valor da 1ª variável.");
      variavel_01 = leia.nextDouble();
      System.out.println("Informe o valor da 2ª variável.");
      variavel_02 = leia.nextDouble();
      
      // A inclusão da variável 'troca' possibilita a permutação de valores entre as variáveis.
      troca = variavel_01; 
      variavel_01 = variavel_02;
      variavel_02 = troca;


      System.out.println("Os valores das variáveis foram trocados. O valor da primeira variável agora é " + variavel_01 +".");
                         
      System.out.println("O valor da segunda variável agora é " + variavel_02 + "."  );
      }
}
