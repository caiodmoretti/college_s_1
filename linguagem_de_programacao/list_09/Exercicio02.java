/*
2.Faça um programa, com uma função que necessite de um argumento. A função retorna o valor de caractere ‘P’,
se seu argumento for positivo, e ‘N’, se seu argumento for zero ou negativo.
 */

package Lista_09;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		
		int numero;
		char caracter;
		
		System.out.print("Informe o número que você quer verificar:");
		numero = entradaPeloTeclado.nextInt();
		caracter = verificarNumero(numero);
		System.out.println("O número informado é positivo?");
		System.out.println("[P = Positivo] [N = Zero ou negativo]");
		System.out.print(caracter);
	}
	//Função para verificar se o número informado é positivo, zero ou negativo. 
	static char verificarNumero(int numero) {
		if(numero <= 0 ) {return 'N';}
		else {return 'P';}
	}
}
