/*
5.Escreva uma função que receba dois números inteiros x e y. Essa função deve verificar se x é divisível por y. No
caso positivo, a função deve retornar 1, caso contrário zero. Escreva tabém um programa principal para testar
tal função.
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
		System.out.println("[1 = x é divisível por y] [0 = x não é divisível por y]");
		System.out.println(verificarDivisivel(x,y));
		
		
	}
	static int verificarDivisivel(int x, int y) {
		if (x % y == 0) {return 1;}
		else {return 0;}
	}
}
