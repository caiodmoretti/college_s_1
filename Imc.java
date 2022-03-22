/* Exercício 08
Programa para calcular o IMC de um usuário.
Os números deverão ser lidos pelo teclado. O usuário deverá informar sua altura e peso. O valor da altura deverá ser separado pelo caracter ponto. Ex: 1.75
Após a entrada dos números, o IMC deverá ser informado.
*/

import java.util.Scanner ;

class Imc {
  public static void main(String[] args) {
    double altura, peso, imc; // Declaração de variáveis.
    Scanner leia = new Scanner ( System.in );
      
      System.out.println("Informe seu peso.");
      peso = leia.nextDouble();
      System.out.println("Informe sua altura.");
      altura = leia.nextDouble();
      
      imc = peso/(altura*altura); // Cálculo do IMC.
      
      System.out.printf("O seu IMC é " + "%.2f", imc); // O ""%.2f" foi usado para apresentar apenas duas casas decimais do IMC.
      
    }
}
