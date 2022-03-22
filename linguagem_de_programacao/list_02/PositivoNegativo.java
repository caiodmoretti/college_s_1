/* Exercício 01
Programa para verificar se um valor é positivo, negativo ou nulo.
O número deverá ser lida pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class PositivoNegativo{
  public static void main(String[] args) {
    double numero; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );

      System.out.println("Confira se um número é positivo, negativo ou nulo!");
      System.out.println("Informe um número.");
      numero = leia.nextDouble();

    if (numero == 0){
        System.out.println("O número informado é nulo!");
    }
      else{
            if (numero > 0) {
                   System.out.println("O número informado é positivo!");
                }
              else {
                  System.out.println("O número informado é negativo!");
                }
          }
    }
}