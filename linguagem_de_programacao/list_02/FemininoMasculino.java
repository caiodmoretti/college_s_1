/* Exercício 03
Programa para verificar para se uma letra digitada  ́e ”F” ou ”M”. Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv ́alido.
O caracter deverá ser lido pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class FemininoMasculino {
  public static void main(String[] args) {
    char caracter_recebido; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );


      System.out.println("Informe a letra.");
      caracter_recebido = leia.next().charAt(0);
      
    if (caracter_recebido == 'F' || caracter_recebido == 'f' ){
        System.out.println("F - Feminino");
    }
      else{
            if (caracter_recebido == 'M' ||caracter_recebido == 'm') {
                   System.out.println("M - Masculino");
                }
              else {
                  System.out.println("Sexo inválido");
                }
          }
    }
}