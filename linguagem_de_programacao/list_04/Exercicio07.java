/* Exercício 07
Faça um programa que escreva todos os números múltiplos de 7 entre 1 e N, sendo N um valor introduzido pelo usuário.
As informações devem ser lidas pelo teclado.
Após a leitura, os números deverão apresentada na tela.
*/

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		int  numero, contador;
        Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Encontre todos os números múltiplos de 7 entre 1 e N!");
        
		System.out.println("Entre com o número que irá delimitar o invervalo (N):");
    	numero = entradaTeclado.nextInt();


        for (contador = 1; contador <= numero; contador++) {
            
            if (contador % 7 == 0 ){ 
	    System.out.println("Encontrei um número que é múltiplo de 7 : " + contador);
            }
            
	    }

	}
}


