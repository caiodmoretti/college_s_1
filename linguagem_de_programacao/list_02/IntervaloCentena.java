/* Exercício 07
Programa para verificar para se número um número digitado está compreendido no intervalo aberto de 0 a 100.
O número deverá ser lido pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class IntervaloCentena {
  public static void main(String[] args) {
    double numero; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );
      System.out.println("Descubra se um número está entre 0 e 100!");
      System.out.println("Informe um número.");
      numero = leia.nextDouble();
      
      
    if (numero > 0 && numero < 100)
    {
        System.out.println("O número informado está entre 0 e 100!");
    }
      else{
        
          System.out.println("O número informado não está entre 0 e 100.");
    }
  }
}