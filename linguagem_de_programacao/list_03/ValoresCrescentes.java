/* Exercício 01
Dados três valores A, B e C, construa um programa, que imprima os valores de forma ascendente (do menor para o maior).
As informações deverão ser lidas pelo teclado.
Após a leitura, a sequência deverá ser apresentada na tela.
*/
import java.util.Scanner ;

class ValoresCrescentes {
  public static void main(String[] args) {
      double valor_1, valor_2, valor_3, valor_comparado; // Declaração de variáveis                            
    Scanner leia = new Scanner ( System .in );
      System.out.println("Informe 3 valores e econtre a ordem crescente!");
      System.out.println("Informe o primeiro valor.");
      valor_1 = leia.nextDouble();
      System.out.println("Informe o segundo valor.");
      valor_2 = leia.nextDouble();
      System.out.println("Informe o terceiro valor.");
      valor_3 = leia.nextDouble();

    if  (valor_1 > valor_2 && valor_1 >valor_3) {
        if(valor_3 > valor_2) {
            System.out.println("A sequencia crescente de valores é: " + 
                valor_2 + " " + valor_3 + " " + valor_1 + ".");
          }
        else{ System.out.println("A sequencia crescente de valores é: " + 
                valor_3 + " " + valor_2 + " " + valor_1 + ".");
            
        }    
    }
    if  (valor_2 > valor_1 && valor_2 >valor_3) {
        if(valor_3 > valor_1) {
            System.out.println("A sequencia crescente de valores é: " + 
                valor_1 + " " + valor_3 + " " + valor_2 + ".");
          }
        else{ System.out.println("A sequencia crescente de valores é: " + 
                valor_3 + " " + valor_1 + " " + valor_2 + ".");
            
        }    
    }
    if  (valor_3 > valor_1 && valor_3 >valor_2) {
        if(valor_2 > valor_1) {
            System.out.println("A sequencia crescente de valores é: " +
                valor_1 + " " + valor_2 + " " + valor_3 + ".");
          }
        else{ System.out.println("A sequencia crescente de valores é: " + 
                valor_2 + " " + valor_1 + " " + valor_3 + ".");
            
        }    
    }
    if  (valor_1 == valor_2 && valor_2 == valor_3) {
            System.out.println("Não há sequencia crescente pois os valores são iguais: " +
                valor_1 + " " + valor_2 + " " + valor_3 + ".");
          }    
    }
  }
