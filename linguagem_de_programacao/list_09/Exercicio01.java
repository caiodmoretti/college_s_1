/*
1.Fa�a um programa, com uma fun��o que necessite de tr�s argumentos, e que forne�a a soma desses tr�s argumentos.
*/

package Lista_09;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int soma, numero_1, numero_2, numero_3;
		
		System.out.println("Informe o primeiro n�mero: ");
    	numero_1 = entradaPeloTeclado.nextInt();
    	System.out.println("Informe o segundo n�mero: ");
    	numero_2 = entradaPeloTeclado.nextInt();;
    	System.out.println("Informe o terceiro n�mero: ");
    	numero_3 = entradaPeloTeclado.nextInt();;
    	soma = somarEntradas(numero_1, numero_2,numero_3);
    	System.out.println("A soma dos n�meros informados �: "+ soma);
	}
	//Fun��o soma das entradas.
	static int somarEntradas(int numero_1, int numero_2, int numero_3) {
		return (numero_1+numero_2+numero_3);
	}

}
