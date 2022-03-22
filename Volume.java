/* Exercício 03
Programa para calcular volume de uma caixa d'água retangular.
A medida deverá ser lida pelo teclado. O usuário deverá informar a largura, a altura e comprimento da caixa d'água.
Após a leitura, o volume deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class Volume {
  public static void main(String[] args) {
    double altura, largura, comprimento, volume; // Declaração de variáveis.
    Scanner leia = new Scanner ( System.in );
      
      System.out.println("Informe a largura da caixa d'água.");
      largura = leia.nextDouble();
      System.out.println("Informe a altura da caixa d'água.");
      altura = leia.nextDouble();
      System.out.println("Informe o comprimento da caixa d'água.");
      comprimento = leia.nextDouble();

      volume = (largura*altura*comprimento); // Cálculo do volume da caixa d'água.
      
      System.out.println("A caixa d´água possui um volume de " + volume );
      }
}
