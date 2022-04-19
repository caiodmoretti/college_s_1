/* Exercício 10
Faça a multiplicação entre dois números usando somente soma.
As informações devem ser lidas pelo teclado.
Após a leitura, o resultado deverá ser apresentado na tela.
*/

import java.util.Scanner;

public class Exercicio10Alternativo {
	public static void main(String[] args) {
		int  numero_1, numero_2, contador, soma = 0;
        Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Faça a multiplicação entre dois números usando somente soma!");
        
		System.out.println("Entre com o primeiro número: ");
    	numero_1 = entradaTeclado.nextInt();
        System.out.println("Entre com o segundo número: ");
    	numero_2 = entradaTeclado.nextInt();


        for (contador = numero_1; contador > 0 ; contador--) {
            
            soma = soma + numero_2;

	    }

        System.out.println("O resultado da operação é: " + soma);
	}
}


/* para contador ← 1 até 5 passo 1 faça */