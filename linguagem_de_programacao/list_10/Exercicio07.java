package Lista_10;
/*
 07.Embaralha palavra. Construa uma função que receba uma string como parâmetro e devolva outra string com
os carateres embaralhados. Por exemplo: se função receber a palavra python, pode retornar npthyo, ophtyn ou
qualquer outra combinação possível, de forma aleatória. Padronize em sua fução que todos os caracteres serão
devolvidos em caixa alta ou caixa baixa, independentemente de como foram digitados.
Obs: Copie a string para um vetor de char para poder realizar a manipulação dos caracteres. Utilize as funçõe
anteriormente criadas para isso.
 */

import java.util.Random;
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		String palavra = "", palavra_embaralhada = "";
		
		palavra = entrada_palavra();
		palavra_embaralhada = embaralhar_palavra(palavra);
		imprimir_palavra_embaralhada(palavra_embaralhada);
	}
	static String entrada_palavra(){
		String palavra = "";
		Scanner entrada_pelo_teclado = new Scanner(System.in);
		System.out.print("Informe uma palavra: ");
		palavra = entrada_pelo_teclado.next();
		return palavra;
	}
	static String embaralhar_palavra(String palavra){
		char vetor_char[] = new char[palavra.length()];

		transformar_em_vetor(palavra,vetor_char);
		embaralhar_vetor(palavra, vetor_char);
		palavra = montar_string(vetor_char, palavra);
		return palavra;
	}
	static void transformar_em_vetor(String palavra, char vetor_char[]) {
		for(int indice_string = 0; indice_string < palavra.length(); indice_string++) {
			 vetor_char[indice_string] = palavra.charAt(indice_string);
		}
	}
	static void embaralhar_vetor(String palavra, char vetor_char[]) {	
		Random entrada_aleatoria = new Random();
		int indice_busca, indice_aleatorio;
		char auxiliar = ' ';
			
		for (indice_busca = 0; indice_busca < palavra.length(); indice_busca++) {
			auxiliar = vetor_char[indice_busca];
			indice_aleatorio = entrada_aleatoria.nextInt(palavra.length());
			vetor_char[indice_busca] = vetor_char[indice_aleatorio];
			vetor_char[indice_aleatorio] = auxiliar;
		}
	}
	static String montar_string(char vetor_char[], String palavra_nova) {
		int tamanho_do_vetor = palavra_nova.length();
		palavra_nova = "";
		for(int indice_string = 0; indice_string < tamanho_do_vetor; indice_string++) {
			 palavra_nova = palavra_nova + vetor_char[indice_string];
		}
		return palavra_nova;
	}
	static void imprimir_palavra_embaralhada(String palavra_embaralhada){
		System.out.print(palavra_embaralhada.toUpperCase() + " !!!");
	}
}
