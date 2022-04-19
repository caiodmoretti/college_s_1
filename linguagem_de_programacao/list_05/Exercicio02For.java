/* Exercício 02
Escreva um programa que determine se um dado número N (digitado pelo usuário) é primo ou não.
*/

import java.util.Scanner;

public class Exercicio02For {
	public static void main(String[] args) {
		double numero, divisor;
        boolean primoVerificado = true;
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com um número e verifique se ele é primo!");
        System.out.println("Entre com um número: ");
    	numero = entradaTeclado.nextDouble();
      /*Princípio do numero primo: para ter um resultado inteiro ele possui como divisor apenas ele mesmo e 1.
        Ou seja, numero % divisor !=0, divisor++; 
          15 / 2 = 7.5  false
          15 / 3 = 5 true 
        */
           for(divisor = 2 ; numero > divisor; divisor++){
                
                if(numero % divisor == 0){
                    primoVerificado = false;
                }   
           }
        
            if(primoVerificado == true){
                System.out.println("O número "+ numero + " é primo."); 
            }
            else{
                System.out.println("O número "+ numero + " não é primo."); 
            }


        }
    }

