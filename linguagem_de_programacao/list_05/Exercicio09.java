/* Exercício 09
Façaa um programa para simular uma situação simples de depósito, retirada e consulta em um banco. O
programa inicialmente deverá mostrar um menu com as seguintes opções:
(a) Depósito
(b) Retirada
(c) Saldo
(d) Sair do programa
Se a escolha do usuário for depósito ou retirada, o programa deverá pedir o valor da operação e atualizar
automaticamente o valor existente na conta. O programa deverá ser utilizado até que o usuário escolha a
opção sair do programa.
Obs: Utilizar as estruturas de seleção múltipla (switch...case) e de repetiçã com condicional no fim.

*/

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		double saldo = 0, valor = 0;
        char operacao;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Bem-vindo ao seu banco digital!");

        //criar o switch com as 4 operacoes

        do{
            System.out.println("Informe qual operação você quer realizar.");
            System.out.println("a) Depósito.");
            System.out.println("b) Retirada.");
            System.out.println("c) Saldo.");
            System.out.println("d) Sair do programa.");
            operacao = entradaTeclado.next().charAt(0);
            switch (operacao){
            case 'a': System.out.println("Informe o valor do depósito.");
                      valor = entradaTeclado.nextDouble();
                      saldo = saldo + valor;
                      System.out.println("Seu déposito foi realizado.");
                      break;
            case 'b': System.out.println("Informe o valor da retirada.");
                      valor = entradaTeclado.nextDouble(); 
                      saldo = saldo - valor;
                      System.out.println("Sua retirada foi realizada.");                    
                      break;
            case 'c': System.out.println("O seu saldo é: " + saldo + "R$");
                      break;
            case 'd': System.out.println("Você escolheu sair do programa.");
                      break;
            default:System.out.println("Você escolheu uma operação que não é válida.");
        }   
      }
        while(operacao != 'd');
    System.out.println("Agradecemos por usar o nosso serviço!");    
   }
}

