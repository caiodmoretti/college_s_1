/* Exercício 02
 Refaça o programa anterior para 100 números.
Após a leitura, a soma deverá ser apresentada na tela.
*/

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		int numero, contador, soma = 0;
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Entre com 100 números e encontre a soma deles!");
        
		System.out.println("Entre com um número:");
    	numero = entradaTeclado.nextInt();
    	contador = 1;
	    while(contador <= 100)
	    {
	    	System.out.println("Entre com um número:");
	    	numero = entradaTeclado.nextInt();
	    	soma =  soma + numero;
	    	contador++;
	    }
	    System.out.println("A soma dos números digitados foi: " + soma);
	}
}


