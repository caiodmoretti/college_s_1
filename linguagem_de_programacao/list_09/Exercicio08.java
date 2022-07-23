/*
8.Criar uma função que calcule e retorne o valor do fatorial de um número. A função deve retornar -1 caso seja
passado um número negativo. Escreva também um programa para testar a função.
 * */

package Lista_09;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o número para verificar seu fatorial: ");
		numero = entradaPeloTeclado.nextInt();
		if(numero>0) {
			System.out.println("O fatorial de "+ numero + " é:");
		System.out.println(fazerFatorial(numero));
		}
		else {
			System.out.println(fazerFatorial(numero));
			}
	}
	static int fazerFatorial(int numero) {
		int fatorial; 
		if(numero>0) {for( fatorial = 1; numero > 0; numero--) {
			fatorial = fatorial*numero;
		}
		return fatorial;}
		else {return -1;}
	}
}
