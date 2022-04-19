/* Exercício 11
Prepare um programa para controlar as informações sobre utilização de um banco eletrônico. Seu programa deverá perguntar aos clientes qual foi a operação que eles realizaram. O programa deverá mostrar um menu com as as seguintes opções:
1 - Depósito
2 - Retirada
3 - Saldo
4 - Extrato
5 - Sair do Programa
O programa deverá ficar em loop, apresentando o menu e lendo a opção do usuário. Após lida a opção de sair do programa, informe quantas operações foram efetuadas de cada tipo e finalize a execução. 

As informações devem ser lidas pelo teclado.
Após a leitura, o resultado deverá ser apresentado na tela.
*/

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		int numero, soma, deposito = 0, retirada = 0, saldo = 0, extrato = 0;
		
		Scanner leia = new Scanner(System.in);
        System.out.println("Bem-vindo ao seu banco eletrônico.");
        System.out.println("As operações disponíves são: ");
        System.out.println("1 - Depósito");
        System.out.println("2 - Retirada");
        System.out.println("3 - Saldo");
        System.out.println("4 - Extrato");
        System.out.println("5 - Sair do Programa");
        
        
	    do {
            System.out.print("Entre com o número da operação [1 a 5]:");
		    numero = leia.nextInt();
		    switch (numero) {
			case 1: System.out.println("Você escolheu Depósito.");
                    deposito++;
					break;
			case 2: System.out.println("Você escolheu Retirada.");
                    retirada++;
                    break;
			case 3:	System.out.println("Você escolheu Saldo.");
                    saldo++;
					break;
			case 4:	System.out.println("Você escolheu Extrato.");
                    extrato++;
                    break;
			case 5:	System.out.println("Você escolheu Sair do programa.");
					break;
			default:System.out.println("Este número não é válido!");
	  }   
    }
            while(numero != 5);
        
            System.out.println("Você realizou a operação depósito " + deposito + " vezes.");
            System.out.println("Você realizou a operação retirada " + retirada + " vezes.");
            System.out.println("Você realizou a operação saldo " + saldo + " vezes.");
            System.out.println("Você realizou a operação extrato " + extrato + " vezes.");
  }
}