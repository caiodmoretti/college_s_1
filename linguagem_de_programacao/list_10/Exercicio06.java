package Lista_10;
/*
06.Faça uma função que receba um vetor de char por parâmetro e retorne uma string composta pelos caracteres do
vetor. Faça um programa principal para testar a função e imprimir o resultado do processamento.
Obs: Não utilizar funções prontas da linguagem para a conversão.
 */

import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		int tamanho_vetor = 0;
		String palavra;
		char vetor_char[];
		
 		tamanho_vetor = defininir_tamanho_vetor(tamanho_vetor);
 		vetor_char = preencher_vetor(tamanho_vetor);
 		palavra = montar_string(vetor_char,tamanho_vetor);
 		imprimir_string(palavra);	
	}
	static int defininir_tamanho_vetor( int tamanho_vetor){
		Scanner entrada_pelo_teclado = new Scanner(System.in);
			System.out.print("\n Informe o tamanho do vetor: ");
			tamanho_vetor = entrada_pelo_teclado.nextInt();
			return tamanho_vetor;
	}	
	static char[] preencher_vetor( int tamanho_vetor){
		char vetor_char[] = new char[tamanho_vetor];
		
		Scanner entrada_pelo_teclado = new Scanner(System.in);
		for(int indice_vetor = 0; indice_vetor < tamanho_vetor; indice_vetor++) {
			System.out.print("\n Informe um caracter: ");
			vetor_char[indice_vetor] = entrada_pelo_teclado.next().charAt(0);
		}
		return vetor_char;
	}
	static String montar_string(char vetor_char[], int tamanho_vetor) {	
		String palavra_nova = "";
		
		for(int indice_string = 0; indice_string < tamanho_vetor; indice_string++) {
			 palavra_nova = palavra_nova + vetor_char[indice_string];
		}
		return palavra_nova;
	}
	static void imprimir_string(String palavra) {
		System.out.print(palavra);
	}
}
