/*
  6.Fa�a uma fun��o que receba um n�mero e retorne se este n�mero � primo. No caso positivo, a fun��o deve
retornar 1, caso contr�rio 0(zero). Escreva tamb�m um programa principal para testar a fun��o.
 */

package Lista_09;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int numero;

		System.out.println("Informe o n�mero que voc� gostaria de verificar: ");
		numero = entradaPeloTeclado.nextInt();		
		if(verificarPrimo(numero) == true) {
			System.out.println("O n�mero informado � primo.");
			}
		else {System.out.println("O n�mero informado n�o � primo.");}
	}
	//Fun��o para verificar se o n�mero informado � primo.
	static boolean verificarPrimo(int numero) {
		boolean primo_verificado = true;
		int contador = numero - 1;
		while(contador>1) {
			if(numero % contador == 0) { 
				primo_verificado = false;
			}
		contador--;
		}
		return primo_verificado;
	}
}
