/*
8.Criar uma fun��o que calcule e retorne o valor do fatorial de um n�mero. A fun��o deve retornar -1 caso seja
passado um n�mero negativo. Escreva tamb�m um programa para testar a fun��o.
 * */

package Lista_09;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o n�mero para verificar seu fatorial: ");
		numero = entradaPeloTeclado.nextInt();
		if(numero>0) {
			System.out.println("O fatorial de "+ numero + " �:");
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
