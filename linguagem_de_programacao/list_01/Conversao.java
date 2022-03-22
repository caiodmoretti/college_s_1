/* Exercício 02
Programa para conversão de uma medida de metros para centímetros.
A medida deverá ser lida pelo teclado. O usuário deverá usar o caracter ponto para separar as casas decimais. Exemplo: 2.5
Após a leitura, a medida convertida deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class Conversao {
  public static void main(String[] args) {
    double metros, centimetros; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );
      
      System.out.println("Informe a medida em metros.");
      metros = leia.nextDouble();
      
      centimetros = (metros*100); // Conversão da medida para centímetros.
      
      System.out.println("A medida informada corresponde a " + centimetros + "cm.");
      }
}
