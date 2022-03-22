/* Exercício 10
Programa para verificar se um ano é bissexto.
As informações deverão ser lidas pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class AnoBissexto{
  public static void main(String[] args) {
    int ano; // Declaração de variáveis                            
    Scanner leia = new Scanner ( System .in );
      System.out.println("Verifique se um ano é bissexto!");
      System.out.println("Informe o ano que você quer verificar.");
      ano = leia.nextInt();

      
    if (((ano % 4 == 0)  && (ano % 100 != 0)) || (ano % 400 == 0))
    {
        System.out.println("O ano informado é bissexto.");

    }
      else{
        System.out.println("O ano informado não é bissexto.");
    }
  }
}