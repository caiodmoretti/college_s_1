/* Exercício 04
 Escreva um programa que leia 20 números e imprima a soma dos positivos e o total de números negativos.
*/

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		int numero, contador = 0, soma_positivos = 0, numeros_negativos = 0 ;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com 20 números inteiros e descubra a soma dos positivos e o total de números negativos!");
        
      //Princípio: numero entra, se numero > 0 soma_positivos = numero + soma_positivos, else numeros_negativos++
        
        while(contador < 20){
        System.out.println("Entre com um número.");
    	    numero = entradaTeclado.nextInt();
            if (numero > 0 ) {
            soma_positivos = numero + soma_positivos;  

            }
            else{
            numeros_negativos++;
            }
        contador++; 
        }
        System.out.println("A soma dos números positivos é: " + soma_positivos);
        System.out.println("Foram inseridos: " + numeros_negativos+ " números negativos.");
      
    }
}

