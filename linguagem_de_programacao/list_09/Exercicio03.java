/*
 3.Faça uma função que retorne a multiplicação entre dois números usando somente soma.
 */

package Lista_09;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int soma = 0, numero_1, numero_2;
		
		System.out.println("Informe o primeiro número.");
		numero_1 = entradaPeloTeclado.nextInt();
		System.out.println("Informe o segundo número.");
		numero_2 = entradaPeloTeclado.nextInt();
		System.out.println("A multiplicação entre os dois números informados resulta em: " + multiplicarEntradas(numero_1,numero_2, soma));
	}
		//Função para retornar a multiplicação entre dois números usando somente soma
		static int multiplicarEntradas(int numero_1, int numero_2, int soma) {
			while(numero_1 > 0) {
				soma = soma + numero_2;
				numero_1--;
			}
			return soma;
		}
}
