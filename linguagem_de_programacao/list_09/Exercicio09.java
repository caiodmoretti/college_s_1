/*
9.Faça um programa para imprimir:
1
2 2
3 3 3
.....
n n n n n n ... n
para um n informado pelo usuário. Use uma função que receba um valor n inteiro e imprima até a n-ésima linha.
 */
 

package Lista_09;
import java.util.Scanner;
public class Exercicio09 {

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
			//Loop para a repetição dos números na mesma linha, sendo que a quantidade de repetições é definida por 'controle' < 'contador'.
			for(controle = 0; controle<contador; controle++ ){
				System.out.print(contador + " ");
			}
			System.out.println();
		}
	}
}
