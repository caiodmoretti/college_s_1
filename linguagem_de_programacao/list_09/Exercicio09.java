/*
9.Fa�a um programa para imprimir:
1
2 2
3 3 3
.....
n n n n n n ... n
para um n informado pelo usu�rio. Use uma fun��o que receba um valor n inteiro e imprima at� a n-�sima linha.
 */
 

package Lista_09;
import java.util.Scanner;
public class Exercicio09 {

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
			//Loop para a repeti��o dos n�meros na mesma linha, sendo que a quantidade de repeti��es � definida por 'controle' < 'contador'.
			for(controle = 0; controle<contador; controle++ ){
				System.out.print(contador + " ");
			}
			System.out.println();
		}
	}
}
