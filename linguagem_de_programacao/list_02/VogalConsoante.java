/* Exercício 04
Programa para verificar para se uma letra digitada é vogal ou consoante.
O caracter deverá ser lido pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class VogalConsoante {
  public static void main(String[] args) {
    char caracter_recebido; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );
      System.out.println("Confira se uma letra é vogal ou consoante!");
      System.out.println("Informe uma letra.");
      caracter_recebido = leia.next().charAt(0);
      
    if (caracter_recebido == 'a' || caracter_recebido == 'e' 
        || caracter_recebido == 'i' || caracter_recebido == 'o' 
        || caracter_recebido == 'u'
        ||caracter_recebido == 'A' || caracter_recebido == 'E' 
        || caracter_recebido == 'I' || caracter_recebido == 'O' 
        || caracter_recebido == 'U'
        )
    {
        System.out.println("A letra informada é uma vogal.");
    }
      else{
        System.out.println("A letra informada é uma consoante.");
    }
  }
}