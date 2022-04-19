/* Exercício 09
Programa para calcular o salário reajustado do usuário.
Os números deverão ser lidos pelo teclado. O usuário deverá informar o salário mensal atual e o percentual de reajuste.
Ao informar um percentual com casas decimais, utilizar o caracter ponto para separar as casas decimais. Ex: 12.5
Após a entrada dos números, o salário reajustado deverá ser informado.
*/

import java.util.Scanner ;

class Salario {
  public static void main(String[] args) {
    double salario, reajuste, salario_final; // Declaração de variáveis
    Scanner leia = new Scanner ( System.in );
      
      System.out.println("Informe seu salário.");
      salario = leia.nextDouble();
      System.out.println("Informe quanto será o percentual de reajuste.");
      reajuste = leia.nextDouble();

      reajuste = (reajuste/100);
      
      salario_final = salario + (salario*reajuste); // Cáculo do salário com o reajuste.
      
      System.out.println("O seu salário reajustado será R$" + salario_final);
      
    }
}
