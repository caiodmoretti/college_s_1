/* Exercício 03
 Escreva um programa que leia 20 números inteiros e imprima quantos são pares e quantos sãoo ímpares.
*/

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		int numero, contador = 0, numeros_par = 0, numeros_impar = 0 ;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com 20 números inteiros e conte quantos são pares e ímpares.");
        
      //Princípio: numero entra, se numero % 2 == 0 numeros_par++, else numeros_impar++
        
        while(contador < 20){
        System.out.println("Entre com um número.");
    	    numero = entradaTeclado.nextInt();
            if (numero % 2 ==0) {
                numeros_par++;
            }
            else{
                numeros_impar++;
            }
        contador++; 
        }
        if(numeros_par == 1){
            System.out.println("Você digitou 1 número par.");
        }
        else{
            System.out.println("Você digitou " + numeros_par + " números pares.");
        }
        if(numeros_impar == 1){
            System.out.println("Você digitou 1 número ímpar.");
        }
        else{
            System.out.println("Você digitou " + numeros_impar + " números ímpares.");
        }       
    }
}

