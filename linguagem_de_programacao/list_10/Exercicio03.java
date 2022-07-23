package Lista_10;
/*
03.Faça uma função para receber uma lista de nomes e um nome a ser procurado. Caso o nome esteja na lista
a função deverá retornar a posição do mesmo na lista, caso contrário deverá retornar -1. Faça um programa
principal para testar a função.
 
 * */
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		final int TAMANHO_VETOR = 5;
		String vetor_nomes[] = new String[TAMANHO_VETOR];
		int posicao_nome = -1;
		
		preencher_vetor(vetor_nomes,TAMANHO_VETOR);
		posicao_nome = verificar_nome(vetor_nomes,posicao_nome,TAMANHO_VETOR);
		impressao_nome(posicao_nome);
	}
	static void preencher_vetor(String vetor_nomes[], int TAMANHO_VETOR) {
		Scanner entrada_pelo_teclado = new Scanner(System.in);
		System.out.println("Construa o vetor de nomes.");	
		for(int indice_vetor = 0; indice_vetor < TAMANHO_VETOR; indice_vetor++) {
			System.out.println("Informe o nome: ");	
			vetor_nomes[indice_vetor] = entrada_pelo_teclado.next();
		}
	}
	static int verificar_nome(String vetor_nomes[],int posicao_nome, int TAMANHO_VETOR) {
		String nome;
		Scanner entrada_pelo_teclado = new Scanner(System.in);
		System.out.println("Informe o nome que você quer verificar: ");
		nome = entrada_pelo_teclado.nextLine();
		for(int indice_vetor = 0; indice_vetor < TAMANHO_VETOR; indice_vetor++) {
			if(vetor_nomes[indice_vetor].contains(nome)){
				posicao_nome = indice_vetor;
			}
		}
		return posicao_nome;
	}
	static void impressao_nome(int posicao_nome) {
		
		if(posicao_nome == -1 ) {
			System.out.println(-1 + "O nome informado não foi encontrado.");
		}
		else {
			System.out.println("O nome informado está na posição " + posicao_nome);			
		}

	}

}
