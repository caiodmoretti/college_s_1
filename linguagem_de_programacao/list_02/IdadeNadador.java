/* Exercício 11
Programa para verificar a categoria de um nadador a partir de sua idade.
As informações deverão ser lidas pelo teclado.
Após a leitura, a categoria deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class IdadeNadador{
  public static void main(String[] args) {
    int idade; // Declaração de variáveis                            
    Scanner leia = new Scanner ( System .in );
      System.out.println("Confira a categoria do nadador.");
      System.out.println("Informe a idade do nadador.");
      idade = leia.nextInt();

      
    if (idade > 5 && idade <= 7 )
    {
        System.out.println("O nadador pertence a categoria infantil A.");

    }
      else{
          if (idade >= 8 && idade <= 12 ){
        System.out.println("O nadador pertence a categoria infantil B.");
    }
      else{
          if (idade >= 13 && idade <= 16 ){
        System.out.println("O nadador pertence a categoria juvenil A.");
      }
      else{
          if (idade >= 14 && idade <= 17 ){
        System.out.println("O nadador pertence a categoria juvenil B.");
          
      }
      else{
          if (idade >= 18 )
        System.out.println("O nadador pertence a categoria adultos.");
          
      }
  }
}
          }
      }
}