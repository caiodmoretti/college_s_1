/* Exercício 04
 Programa que lê duas palavras da entrada e, na saída, imprime a menor palavra.
*/


import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
        
        String primeira_palavra = new String(), segunda_palavra= new String();
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com duas palavras e descubra qual tem o menor comprimento!");        
        System.out.println("Informe a primeira palavra.");
    	primeira_palavra = entradaTeclado.next();
        System.out.println("Informe a segunda palavra.");
    	segunda_palavra = entradaTeclado.next();
        
        if(primeira_palavra.length() == segunda_palavra.length()){
        System.out.println("As duas palavras tem o mesmo tamanho."); 
        }
    
        else{
            if(primeira_palavra.length() < segunda_palavra.length()){
            System.out.println("A menor palavra informada foi " + primeira_palavra ); 
            }
            else{
            System.out.println("A menor palavra informada foi " + segunda_palavra );             
            }
        }
    }
}

