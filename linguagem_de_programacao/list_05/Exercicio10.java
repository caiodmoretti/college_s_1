/* Exercício 10
. Façaa um programa para calcular a área de figuras geométricas. Inicialmente o programa deverá apresentar
ao usuário um menu principal, onde será escolhida uma dentre as seguintes opções:
1 - Calcular a área do quadrado
2 - Calcular a área do retângulo
3 - Calcular a área do triângulo
4 - Calcular a área do círculo
5 - Sair do programa
Após ser escolhida uma das figuras, o usuário deverá então entrar com as devidas medidas da mesma para
que o cálculo possa ser realizado. Depois de informar o resultado do cálculo, o programa deverá então
voltar ao menu principal até que o usuário deseje finalizar o programa.
Obs: Utilizar as estruturas de seleçãoao múltipla (switch...case) e de repetição com condicional no fim.

*/

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		double lado = 0, altura = 0, largura = 0, raio = 0, base = 0, area;
        int opcao;
//        String figura, quadrado, retângulo, triângulo, círculo;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Calcule a área de figuras geométricas!");

        //criar o switch com as 4 figuras geométricas

        do{
            System.out.println("Informe qual forma você quer calcular a área.");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Triângulo");
            System.out.println("4 - Círculo");            
            System.out.println("5 - Sair do programa.");
            opcao = entradaTeclado.nextInt();
            switch (opcao){
            case 1: System.out.println("Informe o lado do quadrado.");
                    lado = entradaTeclado.nextDouble(); 
                    area = lado*lado;
                    System.out.println("A área do quadrado é " + area);
                    break;
            case 2: System.out.println("Informe a altura do retângulo.");
                    altura = entradaTeclado.nextDouble();
                    System.out.println("Informe a largura do retângulo.");
                    largura = entradaTeclado.nextDouble();                    
                    area = altura*largura;
                    System.out.println("A área do retângulo é " + area);
                    break;
            case 3: System.out.println("Informe a altura do triângulo.");
                    altura = entradaTeclado.nextDouble();
                    System.out.println("Informe a base do triângulo.");
                    base = entradaTeclado.nextDouble();                    
                    area = (altura*base)/2;
                    System.out.println("A área do triângulo é " + area);
                    break;
            case 4: System.out.println("Informe o raio do círculo.");
                    raio = entradaTeclado.nextDouble();               
                    area = Math.PI*Math.pow(raio,2);
// Math.PI = returns PI (the ratio of a circle's area to the square of its radius, approximately 3.14)
//Math.pow(x,y) = The Math.pow() method returns the value of x to the power of y
                    System.out.printf("%nA área do círculo é: %.2f %n", area);
                    break;
//The %n separator printf() will automatically insert the host system's native line separator.
            case 5: System.out.println("Você escolheu sair do programa.");
                    break;            
            default:System.out.println("Você escolheu uma operação que não é válida.");
        }   
      }
        while(opcao != 5);
    System.out.println("Obrigado por usar nosso programa.");    
   }
}

