/* Exercício 08
Programa para verificar a aprovação de um empréstimo. O valor máximo da
prestação não poderá ultrapassar 30% do salário bruto.
As informações deverão ser lidas pelo teclado.
Após a leitura, a aprovação ou rejeição do empréstimo deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class VerificarEmprestimo{
  public static void main(String[] args) {
    double salario_bruto, valor_emprestimo; // Declaração de variáveis
    int parcelas;                             
    Scanner leia = new Scanner ( System .in );
      System.out.println("Verifique se seu empréstimo será aprovado.");
      System.out.println("Informe seu salário.");
      salario_bruto = leia.nextDouble();
      System.out.println("Informe o valor do empréstimo desejado.");
      valor_emprestimo = leia.nextDouble();
      System.out.println("Informe em quantas prestações o empréstimo será financiado.");
    parcelas = leia.nextInt();
      
    if (valor_emprestimo/parcelas > salario_bruto*0.3)
    {
        System.out.println("O empréstimo não foi aprovado.");
    }
      else{
        
          System.out.println("O empréstimo foi aprovado.");
    }
  }
}