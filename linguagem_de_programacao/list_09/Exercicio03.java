/*
 3.Fa�a uma fun��o que retorne a multiplica��o entre dois n�meros usando somente soma.
 */

package Lista_09;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int soma = 0, numero_1, numero_2;
		
		System.out.println("Informe o primeiro n�mero.");
		numero_1 = entradaPeloTeclado.nextInt();
		System.out.println("Informe o segundo n�mero.");
		numero_2 = entradaPeloTeclado.nextInt();
		System.out.println("A multiplica��o entre os dois n�meros informados resulta em: " + multiplicarEntradas(numero_1,numero_2, soma));
	}
		//Fun��o para retornar a multiplica��o entre dois n�meros usando somente soma
		static int multiplicarEntradas(int numero_1, int numero_2, int soma) {
			while(numero_1 > 0) {
				soma = soma + numero_2;
				numero_1--;
			}
			return soma;
		}
}
