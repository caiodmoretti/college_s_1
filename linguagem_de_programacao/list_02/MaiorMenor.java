/* Exercício 02
Programa para verificar para receber dois números e informar qual deles  ́e o maior ou se são iguais.
O número deverá ser lida pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class MaiorMenor {
  public static void main(String[] args) {
    double numero_1, numero_2; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );

      System.out.println("Compare dois números e descubra o maior!");
      System.out.println("Informe o 1º número.");
      numero_1 = leia.nextDouble();
      System.out.println("Informe o 2º número.");
      numero_2 = leia.nextDouble();

    if (numero_1 > numero_2){
        System.out.println("O número " + numero_1 + " é o maior!");
    }
      else{
            if (numero_1 == numero_2) {
                   System.out.println("Os números são iguais!");
                }
              else {
                  System.out.println("O número " + numero_2 + " é o maior!");
                }
          }
    }
}