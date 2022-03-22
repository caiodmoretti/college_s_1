/* Exercício 09
Programa para verificar quanto de comissão um vendedor irá receber. Ele deverá receber uma comissão de 3% sobre o total das vendas até R$1.500,00 e 5% sobre o que ultrapassar este valor. A comissão deverá ser somada ao salário do vendedor.
As informações deverão ser lidas pelo teclado.
Após a leitura, o montate deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class CalcularComissao{
  public static void main(String[] args) {
    double salario, valor_vendido; // Declaração de variáveis                            
    Scanner leia = new Scanner ( System .in );
      System.out.println("Verifique quanto será sua comissão!");
      System.out.println("Informe seu salário.");
      salario = leia.nextDouble();
      System.out.println("Informe o quanto foi vendido.");
      valor_vendido = leia.nextDouble();
      
    if (valor_vendido <= 1500)
    {
        System.out.println("Sua comissão foi de R$ " + ( valor_vendido*0.03) + " .");
        System.out.println("O seu sálário será R$ " + (salario+valor_vendido*0.03) + " .");
    }
      else{
        System.out.println("Sua comissão foi de R$" + 
                           (1500*0.03 + (valor_vendido-1500)*0.05) + " .");
          
          System.out.println("O seu sálário total será R$" + 
                             (salario + 1500*0.03 + (valor_vendido-1500)*0.05) + " .");
    }
  }
}