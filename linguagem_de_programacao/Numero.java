/* Exercício 06
Programa para ler um número inteiro e apresentar o seu antecessor e sucessor.
O número deverá ser lido pelo teclado. O usuário deverá informar um número inteiro.
Após a entrada do número, o antecessor e sucessor deverão ser informados.
*/

import java.util.Scanner ;

class Numero {
  public static void main(String[] args) {
    int numero; // Declaração de variáveis
    Scanner leia = new Scanner ( System.in );
      
      System.out.println("Informe um número.");
      numero = leia.nextInt();
      
      System.out.println("O antecessor do número informado é "+ (numero-1) + ".");
      System.out.println("O sucessor do número informado é "+ (numero+1) + ".");
    }
}
