/* Exercício 05
Programa para calcular a posição para a qual se deslocou um móvel em movimento retilíneo uniforme.
As variáveis deverão ser lidas pelo teclado. O usuário deverá informar o espaço inicial, a velocidade e o tempo.
Após a entrada dos devidos valores, a posição de desloscamento deverá ser informada.
*/

import java.util.Scanner ;

class Movimento {
  public static void main(String[] args) {
    double espaco_inicial, espaco_final, tempo, velocidade; // Declaração de variáveis
    Scanner leia = new Scanner ( System.in );
      
      System.out.println("Informe o espaço inicial.");
      espaco_inicial = leia.nextDouble();
      System.out.println("Informe a velocidade do móvel.");
      velocidade = leia.nextDouble();
      System.out.println("Informe o tempo de deslocamento.");
      tempo = leia.nextDouble();

      espaco_final = espaco_inicial + velocidade * tempo; // Cálculo do espaço final.
      
      System.out.println("A posição final do móvel é "+ espaco_final);
    }
}
