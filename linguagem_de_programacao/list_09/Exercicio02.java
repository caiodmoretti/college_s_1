/*
2.Fa�a um programa, com uma fun��o que necessite de um argumento. A fun��o retorna o valor de caractere �P�,
se seu argumento for positivo, e �N�, se seu argumento for zero ou negativo.
 */

package Lista_09;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		
		int numero;
		char caracter;
		
		System.out.print("Informe o n�mero que voc� quer verificar:");
		numero = entradaPeloTeclado.nextInt();
		caracter = verificarNumero(numero);
		System.out.println("O n�mero informado � positivo?");
		System.out.println("[P = Positivo] [N = Zero ou negativo]");
		System.out.print(caracter);
	}
	//Fun��o para verificar se o n�mero informado � positivo, zero ou negativo. 
	static char verificarNumero(int numero) {
		if(numero <= 0 ) {return 'N';}
		else {return 'P';}
	}
}
