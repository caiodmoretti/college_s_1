/* Exercício 04
Prepare um programa para calcular a soma dos números entre 1 e N inclusive. O valor de N deve ser perguntado no início do programa.
As informações devem ser lidas pelo teclado.
Após a leitura, a soma deverá ser apresentada na tela.
*/

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		int numero, contador, soma = 0;
        Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Confira a soma dos números entre 1 e N!");
        System.out.println("Entre com um número que irá representar N:");
    	numero = entradaTeclado.nextInt();
        
    	
	    for (contador = 1; contador <= numero; contador++) {
            
            soma = soma +  contador; 
            
	    }
	    System.out.println("A soma dos números entre 1 e N é: " + soma);
	}
}
