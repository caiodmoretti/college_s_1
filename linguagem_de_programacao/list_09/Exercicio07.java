/*
Criar uma função que determine se um caractere, recebido como parâmetro, é ou não uma letra do alfabeto. A
função deve retornar 1 caso positivo e 0 em caso contário. Escreva tambémm um programa para testar a funçãoao.
Obs: Utilize, dentro da função, um vetor contendo todas as letras do alfabeto para a realizção das comparações.
 * */

package Lista_09;
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		Scanner entradaPeloTeclado = new Scanner(System.in);
		char caracter;
		
		System.out.println("Informe o caracter que você gostaria de verificar: ");
		caracter = entradaPeloTeclado.next().charAt(0);
		if(verificarCaracter(caracter) == 1) {
			System.out.println("Você digitou um caracter que está no alfabeto.");
		}
		else {System.out.println("Você digitou um caracter que não está no alfabeto.");}		
	}
	static int verificarCaracter(char caracter) {
		int caracter_esta_no_alfabeto = 0;
		char vetor_alfabeto[] = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k',
				'l', 'm', 'n','p','q','r','s','t','u','v','x','w','y','z'};	
		for(int linha = 0; linha < 25; linha++) {
			if(vetor_alfabeto[linha] == caracter) {
				 caracter_esta_no_alfabeto = 1;
			}
		}
		return caracter_esta_no_alfabeto;
	}
}
