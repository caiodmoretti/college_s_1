/*
5.Escreva uma fun��o que receba dois n�meros inteiros x e y. Essa fun��o deve verificar se x � divis�vel por y. No
caso positivo, a fun��o deve retornar 1, caso contr�rio zero. Escreva tab�m um programa principal para testar
tal fun��o.
 */

package Lista_09;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int x, y;
		
		System.out.println("Informe o valor de x: ");
		x = entradaPeloTeclado.nextInt();
		System.out.println("Informe o valor de y: ");
		y = entradaPeloTeclado.nextInt();
		System.out.println("[1 = x � divis�vel por y] [0 = x n�o � divis�vel por y]");
		System.out.println(verificarDivisivel(x,y));
		
		
	}
	static int verificarDivisivel(int x, int y) {
		if (x % y == 0) {return 1;}
		else {return 0;}
	}
}
