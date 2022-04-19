/* Exercício 07
Escreva um programa que leia um conjunto de 50 fichas, cada uma contendo a altura e o sexo (M/F) de
uma pessoa. Calcule e imprima:
(a) A maior e a menor altura da turma.
(b) A média de altura das mulheres.
(c) A média de altura da turma.
*/

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		double numero, maior_altura = 0, menor_altura = Integer.MAX_VALUE, soma_turma = 0, soma_mulheres = 0;
        int  contador, numero_alunas = 0;
        char ficha;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Cadastre os dados da sua turma!");

        //informar se a ficha é M || F
        // somar e guardar para calcular a média
        // verificar o número com a maior e menor altura
        // Integer.MAX_VALUE = "represents the maximum positive integer value that can be represented in 32 bits"
        
        contador = 0;
        while ( contador < 50){
        System.out.println("Informe o sexo do aluno [M ou F]");
    	ficha = entradaTeclado.next().charAt(0);
        switch (ficha){
            case 'M': System.out.println("Informe a altura do aluno.");
                      numero = entradaTeclado.nextDouble();
                      soma_turma = soma_turma + numero;
                      if (numero > maior_altura){
                            maior_altura = numero;
                        }
                      if (numero < menor_altura){
                            menor_altura = numero;
                        }                        
                    break;

            case 'F': System.out.println("Informe a altura da aluna.");
                      numero = entradaTeclado.nextDouble();
                      soma_turma = soma_turma + numero;
                      soma_mulheres = numero + soma_mulheres;
                      numero_alunas++;
                     if (numero > maior_altura){
                            maior_altura = numero;
                        }
                      if (numero < menor_altura){
                            menor_altura = numero;
                        } 
                    break;
                    
        }

            contador++;
            }
    System.out.println("A altura média da turma é: " + soma_turma/contador);
    System.out.println("A altura média das mulheres turma é: " + soma_mulheres/numero_alunas);
    System.out.println("A maior altura da turma é: " + maior_altura);
    System.out.println("A menor altura da turma é: " + menor_altura);
    
        
    }
}

