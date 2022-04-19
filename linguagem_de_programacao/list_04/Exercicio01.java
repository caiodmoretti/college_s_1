/* Exercício 01
Prepare um programa para perguntar 10 números e informar a soma total destes números
As informações devem ser lidas pelo teclado.
Após a leitura, a soma deverá ser apresentada na tela.
*/

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		int numero, contador, soma = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Entre com 10 números e encontre a soma deles!");
         
		System.out.println("Entre com um número:");
    	numero = entradaTeclado.nextInt();
    	
	    for (contador = 1; contador <= 10; contador++) {
            soma =  soma + numero;
	    	System.out.println("Entre com um número:");
	    	numero = entradaTeclado.nextInt(); 
	    }
	    System.out.println("A soma dos números digitados foi: " + soma);
	}
}
