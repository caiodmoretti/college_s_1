package Lista_10;
/*
05.Faça uma função que receba uma string por parâmetro e retorne um vetor de char com o conteúdo da string.
Faça um programa principal para testar a função e imprimir o resultado do processamento.
Obs: Não utilizar funções prontas da linguagem para a conversão.
 */

import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada_pelo_teclado = new Scanner(System.in);
		String palavra="";
		char vetor_char[];

		palavra = entrada_palavra(palavra);
		vetor_char = transformar_string(palavra);	
		imprimir_vetor(vetor_char);
	}
	static String entrada_palavra(String palavra){
		Scanner entrada_pelo_teclado = new Scanner(System.in);
		System.out.print("Informe uma palavra: ");
		palavra = entrada_pelo_teclado.next();
		return palavra;
	}
	static char [] transformar_string(String palavra) {
		char vetor_char[] = new char[palavra.length()];
		for(int indice_string = 0; indice_string < palavra.length(); indice_string++) {
			 vetor_char[indice_string] = palavra.charAt(indice_string);
		}
		return vetor_char;
	}
	static void imprimir_vetor(char vetor_char[]) {
		for(int indice_vetor = 0; indice_vetor< vetor_char.length; indice_vetor++) {
			System.out.print(" |" + vetor_char[indice_vetor] + "| ");
		}
	}
}
