/* Exercício 01
Prepare um algoritmo para perguntar o nome e o sexo de 10 pessoas e informar quantas são homens e quantas são mulheres.
*/


// Perguntar o nome
// Perguntar o sexo
// if M || m contador_m++, else contador_f++
// Rpetir 10 vezes

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		int contador_m = 0, contador_f = 0, contador_geral = 0 ;
        String nome;
        char sexo;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com o nome e sexo de 10 pessoas!");        

        while(contador_geral<10){
        System.out.println("Informe o nome.");
    	nome = entradaTeclado.next();
        System.out.println("Informe o sexo. [M para 'masculino' ou F para 'feminino']");
    	sexo = entradaTeclado.next().charAt(0);
            if (sexo =='M' || sexo == 'm'){
                contador_m++;
            }
            else{
                contador_f++;
                }
        contador_geral++;
        }
        System.out.println("Você informou " + contador_m + " homens.");
        System.out.println("Você informou " + contador_f + " mulheres.");
    }
}

