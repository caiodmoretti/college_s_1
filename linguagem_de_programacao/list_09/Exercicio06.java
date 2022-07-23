/*
  6.Faça uma função que receba um número e retorne se este número é primo. No caso positivo, a função deve
retornar 1, caso contrário 0(zero). Escreva também um programa principal para testar a função.
 */

package Lista_09;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número que você gostaria de verificar: ");
		numero = entradaPeloTeclado.nextInt();		
		if(verificarPrimo(numero) == true) {
			System.out.println("O número informado é primo.");
			}
		else {System.out.println("O número informado não é primo.");}
	}
	//Função para verificar se o número informado é primo.
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
