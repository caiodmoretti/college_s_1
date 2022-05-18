/* Exercício 01
Prepare um algoritmo para perguntar o nome e a altura de 20 pessoas e informar:
(a) a média destas alturas
(b) a altura da pessoa mais baixa
(c) o nome da pessoa mais alta
*/


// Perguntar o nome
// Perguntar a altura
// ir somando as alturas
// quando maior_altura, atribuir nome_maior_altura
// quando menor_altura, salvar a entrada
// soma_altura/20

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		int contador_geral = 0;
        double altura, maior_altura = 0, menor_altura = Double.MAX_VALUE, soma_altura = 0;
        String nome, nome_maior_altura = new String();
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com o nome e altura de 20 pessoas e descubra a média das alturas, a pessoa mais alta e a menor altura registrada!");        

        while(contador_geral < 20){
        System.out.println("Informe o nome.");
    	nome = entradaTeclado.next();
        System.out.println("Informe altura.");
        altura = entradaTeclado.nextDouble();
        if(altura > maior_altura){
            nome_maior_altura = nome;
            maior_altura = altura;
        System.out.println(nome_maior_altura);
        }
        if(altura < menor_altura){
          menor_altura = altura; 
        }
        soma_altura = soma_altura + altura;
        contador_geral++;
        }

        System.out.println("A média das altura é: " + soma_altura/20);
        System.out.println("A pessoa mais alta é: " + nome_maior_altura);
        System.out.println("A menor altura registrada foi: " + menor_altura);   
    }
}

