/*
4.Faça uma função que receba um número e diga se é um número perfeito. Um número é perfeito se a soma de
seus divisores é igual ao próprio número. Ex: 1+ 2 + 3 = 6, 6 é um número perfeito.
 * */

package Lista_09;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o número para verificação:");
		numero = entradaPeloTeclado.nextInt();
		if(verificarNumeroPerfeito(numero) == true) {
			System.out.println("O número informado é perfeito.");
		}
		else {System.out.println("O número informado não é perfeito.");}
	}
	//Função para verificar se o número informado é perfeito.
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
