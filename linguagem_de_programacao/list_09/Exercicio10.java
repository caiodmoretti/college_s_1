/*
 Fa�a um programa para imprimir:
1
1 2
1 2 3
.....
1 2 3 4 5 6 ... n
para um n informado pelo usu�rio. Use uma fun��o que receba um valor n inteiro e imprima at� a n-�sima linha.
 */

package Lista_09;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe o n�mero : ");
		numero = entradaPeloTeclado.nextInt();
		//Chamada da fun��o impressaoNumero.
		impressaoNumero(numero);
	}
	static void impressaoNumero(int numero) {
		int controle = 1;
		//Loop para a impress�o dos n�meros.
		for(int contador = 1; contador<numero+1; contador++) {
			//Loop para a impress�o sequencial dos n�meros na mesma linha.
			for(controle = 1; controle<contador+1; controle++ ){
				System.out.print(controle + " ");				
			}
			System.out.println();
		}
	}
}
