/*
 Faça um programa para imprimir:
1
1 2
1 2 3
.....
1 2 3 4 5 6 ... n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
 */

package Lista_09;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o número : ");
		numero = entradaPeloTeclado.nextInt();
		//Chamada da função impressaoNumero.
		impressaoNumero(numero);
	}
	static void impressaoNumero(int numero) {
		int controle = 1;
		//Loop para a impressão dos números.
		for(int contador = 1; contador<numero+1; contador++) {
			//Loop para a impressão sequencial dos números na mesma linha.
			for(controle = 1; controle<contador+1; controle++ ){
				System.out.print(controle + " ");				
			}
			System.out.println();
		}
	}
}
