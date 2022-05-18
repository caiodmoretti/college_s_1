/* Exercício 05
 Façaa um programa que leia 2 strings e informe o conteúdo delas seguido do seu comprimento. Informe também se as duas strings possuem o mesmo comprimento e são iguais ou diferentes no conteúdo.

*/


import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
        
        String primeira_palavra = new String(), segunda_palavra= new String();
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com duas palavras (strings) e faça uma comparação dos seus conteúdos e comprimentos!");        
        System.out.println("Informe a primeira palavra.");
    	primeira_palavra = entradaTeclado.next();
        System.out.println("Informe a segunda palavra.");
    	segunda_palavra = entradaTeclado.next();
        
        System.out.println("A primeira string informada foi " + primeira_palavra);
        System.out.println("O comprimento da primeira string informada é " +primeira_palavra.length() );
        System.out.println("A segunda string informada foi " + segunda_palavra);
        System.out.println("O comprimento da segunda string informada é " + segunda_palavra.length() );

        if(primeira_palavra.equals(segunda_palavra)){
        System.out.println("O conteúdo das duas é igual!");
        System.out.println("O comprimento das duas é igual!");
    }
        else{
        System.out.println("O conteúdo das duas não é igual!");
            if(primeira_palavra.length() == segunda_palavra.length()){
            System.out.println("O comprimento das duas é igual!");            
            }
            else{
            System.out.println("O comprimento das duas não é igual!");                   
            }
            
        }

  }
}

