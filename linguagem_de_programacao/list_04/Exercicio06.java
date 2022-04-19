/* Exercício 06
Criar um programa que leia os limites inferior e superior de um intervalo e imprima todos os números pares no intervalo aberto e seu somatório.Suponha que os dados digitados são para um intervalo crescente, ou seja, o primeiro valor é menor que o segundo.
As informações devem ser lidas pelo teclado.
Após a leitura, os números e a somatória deverão ser apresentadas na tela.
*/

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		int  maior_numero, menor_numero, somatorio_par = 0, contador;
        Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Encontre todos os números pares em um intervalo intervalo e seu somatório!");
        
		System.out.println("Entre com o menor número:");
    	menor_numero = entradaTeclado.nextInt();
		System.out.println("Entre com o maior número:");
    	maior_numero = entradaTeclado.nextInt();

        for (contador = menor_numero; contador <= maior_numero; contador++) {
            
            
            if (contador % 2 == 0 ){ 
                System.out.println(contador);
                somatorio_par = somatorio_par + contador;
            }
            
	    }
	    System.out.println("A soma dos números pares do intervalo é: " + somatorio_par);
	}
}


