/*
4.Fa�a uma fun��o que receba um n�mero e diga se � um n�mero perfeito. Um n�mero � perfeito se a soma de
seus divisores � igual ao pr�prio n�mero. Ex: 1+ 2 + 3 = 6, 6 � um n�mero perfeito.
 * */

package Lista_09;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o n�mero para verifica��o:");
		numero = entradaPeloTeclado.nextInt();
		if(verificarNumeroPerfeito(numero) == true) {
			System.out.println("O n�mero informado � perfeito.");
		}
		else {System.out.println("O n�mero informado n�o � perfeito.");}
	}
	//Fun��o para verificar se o n�mero informado � perfeito.
	static boolean verificarNumeroPerfeito(int numero) {
		int soma = 0;
		int contador = 1;
		while(contador < numero) {
			if(numero % contador == 0) {
				soma = soma + contador;	
			}
			contador++;
		}
		if(soma == numero) {return true;}
		else {return false;}
	}
}
