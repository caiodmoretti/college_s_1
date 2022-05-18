/* Exercício 06
 Façaa um programa que solicite o nome do usuário e imprima-o na vertical.
Ex:
F
U
L
A
N
O

*/

// nome.lenght() = valor inteiro que começa do 1
// charAt() tem inicio no 0
// por isso a necessidade de incluir -1 em:  contador <= nome.length() - 1

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
        
        String nome = new String() ;
        int contador = 0;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com seu nome e tenha uma surpresa!");        
        System.out.println("Informe seu nome.");
    	nome = entradaTeclado.next();
        for (contador = 0; contador <= nome.length() - 1; contador++) {  

                System.out.println(nome.charAt(contador));  

            } 
        }
    }
