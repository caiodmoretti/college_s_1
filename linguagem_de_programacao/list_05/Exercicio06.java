/* Exercício 06
Construa um programa para calcular a média de valores PARES e ÍMPARES, que serão digitados pelo usuário. Ao final o programa deve mostrar estas duas médias. O programa deve mostrar também o maior número PAR digitado e o menor número ÍMPAR digitado. Para finalizar o usuário irá digitar um valor negativo.
*/

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		int numero, soma_par = 0, soma_impar = 0, divisor_par = 1, divisor_impar = 1, media_par = 0, media_impar = 0, maior_par = 0, menor_impar = 0 ;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com diversos números e confira a média de valores pares e ímpares, o maior número par e o menor número ímpar! Para encerrar as entradas, basta digitar um número negativo!");

        //soma: if (numero % 2 == 0) soma_par =  soma_par + numero
        //media: soma_par/1++
        //maior_numero: if (numero > maior_par) maior_par=numero
        //menor_impar:  menor_impar = numero; if (numero < menor_impar) menor_impar = numero 
        
         System.out.println("Entre com um número.");
    	numero = entradaTeclado.nextInt();
        while (numero > 0){
            if (numero % 2 == 0){
                soma_par = soma_par + numero;
                media_par = soma_par/(divisor_par);
                divisor_par++;
                if(numero > maior_par){
                    maior_par = numero;
                }
            }
            else{
                soma_impar = soma_impar + numero;
                media_impar = soma_impar/(divisor_impar);
                divisor_impar++;
                menor_impar = numero;
                if(numero < menor_impar){
                    menor_impar = numero;
                }
            }
        System.out.println("Entre com um número.");
        numero = entradaTeclado.nextInt();    
        }
        System.out.println("A soma dos números pares é: " + soma_par);
        System.out.println("A média dos números pares é: " + media_par);
        System.out.println("O maior número par foi: " + maior_par);
        
        System.out.println("A soma dos números ímpares é: " + soma_impar);
        System.out.println("A média dos números ímpares é: " + media_impar);
        System.out.println("O menor número ímpar foi: " + menor_impar);
        
    }
}

