/* Exercício 01
Escreva um programa para calcular o fatorial do número N, cujo valor é obtido através do usuário pelo teclado.
Versão usando o for e alterando os int para double.
*/

import java.util.Scanner;

public class Exercicio01For {
	public static void main(String[] args) {
		double numero, fatorial ;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com um número e calcule o seu fatorial.");
    	numero = entradaTeclado.nextDouble();

        
      //Princípio do fatorial: para um fatorial inicial, enquanto o numero é maior que 1, faça fatorial * numero, e depois numero--;
        
        
        for (fatorial = 1; numero > 1; numero--){
            fatorial = fatorial *(numero);
        }

        System.out.println("O fatorial do número inserido é " + fatorial);  
               
    }
}

