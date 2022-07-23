/*
1.Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.
*/

package Lista_09;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		int soma, numero_1, numero_2, numero_3;
		
		System.out.println("Informe o primeiro número: ");
    	numero_1 = entradaPeloTeclado.nextInt();
    	System.out.println("Informe o segundo número: ");
    	numero_2 = entradaPeloTeclado.nextInt();;
    	System.out.println("Informe o terceiro número: ");
    	numero_3 = entradaPeloTeclado.nextInt();;
    	soma = somarEntradas(numero_1, numero_2,numero_3);
    	System.out.println("A soma dos números informados é: "+ soma);
	}
	//Função soma das entradas.
	static int somarEntradas(int numero_1, int numero_2, int numero_3) {
		return (numero_1+numero_2+numero_3);
	}

}
