/* Exercício 09
Escreva um programa que receba números do usuário enquanto eles forem positivos. No final o programa deve imprimir quantos números foram digitados.
As informações devem ser lidas pelo teclado.
Após a leitura, a contagem deverá ser apresentada na tela.
*/

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		int  contador, numero;
        Scanner entradaTeclado = new Scanner(System.in);

		System.out.println("Digite números positivos! Ao digitar um número negativo, você irá descobrir quantos números você digitou!");
        System.out.println("Digite um número: ");
        numero = entradaTeclado.nextInt();

    contador = 0;
    while (numero > 0)
        {

                System.out.println("Digite um número: ");
                numero = entradaTeclado.nextInt();
                contador++;
                       
        }
 
    System.out.println("Você digitou " + contador + " números.");
      
    }
}
