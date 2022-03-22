/* Exercício 07
Programa para ler 3 valores e calcular a média ponderada.
Os números deverão ser lidos pelo teclado. O usuário deverá informar as notas, elas terão peso 1, 2 e 3 respectivamente. Os valores não inteiros deverão usar o caracter ponto para separar as casas decimais. Ex: 7.5
Após a entrada dos números, a média ponderada deverá ser informada.
*/

import java.util.Scanner ;

class Media {
  public static void main(String[] args) {
    double nota_1, nota_2, nota_3, media_final; // Declaração de variáveis.
    Scanner leia = new Scanner ( System.in );
      
      System.out.println("Informe a primeira nota.");
      nota_1 = leia.nextDouble();
      System.out.println("Informe a segunda nota.");
      nota_2 = leia.nextDouble();
      System.out.println("Informe a terceira nota.");
      nota_3 = leia.nextDouble();

      media_final = (double)(nota_1*1+nota_2*2+nota_3*3)/6; // Cálculo da média ponderada.
      
      System.out.printf("A sua média ponderada é " + "%.2f", media_final); // O "%.2f" foi usado para apresentar apenas duas casas decimais da média.
      
    }
}
