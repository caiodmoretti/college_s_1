/* Exercício 01
Escreva um programa para calcular o fatorial do número N, cujo valor é obtido através do usuário pelo teclado.
*/

import java.util.Scanner;

public class Exercicio01While {
	public static void main(String[] args) {
		int numero, fatorial ;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com um número e calcule o seu fatorial.");
    	numero = entradaTeclado.nextInt();

        
      //Princípio do fatorial: repetir (fatorial * numero), numero-- até numero = 1; 
        fatorial = 1;
        while (numero > 1 ){
        fatorial = fatorial *(numero);

        numero--;
     
        }
        System.out.println("O fatorial do número inserido é " + fatorial);  
               
    }
}

