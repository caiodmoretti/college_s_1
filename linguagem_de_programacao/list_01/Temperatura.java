/* Exercício 01
Programa para conversão de temperatura.
A temperatura deverá ser lida pelo teclado. O usuário deverá informar o valor usando a escala Celsius. Ao informar um número não inteiro, é necessário usar o carácter ponto para separar as casas decimais. Ex: 100.5
Após a leitura, a conversão em Fahrenheit e Kelvin deverá ser apresentada na tela.
*/

import java.util.Scanner ;

class Temperatura {
  public static void main(String[] args) {
    double temperatura, fahrenheit, kelvin; // Declaração de variáveis
    Scanner leia = new Scanner ( System .in );
      
      System.out.println("Informe a temperatura em Celsius.");
      temperatura = leia.nextDouble();
      
      fahrenheit = (9*temperatura+160)/5; // Conversão para Fahrenheit.
      kelvin = (temperatura + 273); // Conversão para Kelvin.
      
      System.out.println("A temperatura informada corresponde a " + fahrenheit + "ºF.");
      System.out.println("A temperatura informada corresponde a " + kelvin + "K.");
  }
}
