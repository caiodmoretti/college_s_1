/*Exercício 08
Após ler dois vetores de inteiros A e B de tamanho N cada um:
(a) Armazenar em um terceiro vetor ”Soma”, a soma dos elementos do vetor A com os do vetor B (respeitando
as mesmas posições) e escrever os elementos deste;
(b) Escrever a quantidade de vezes que A e B possuem os mesmos números nas mesmas posições
*/
import java.util.Scanner;

class Exercicio08 {
  public static void main(String[] args) {

	Scanner entradaPeloTeclado = new Scanner(System.in);      

    int posicao_a = 0, posicao_b = 0, posicao_soma = 0, tamanho = 0, quantidade_iguais = 0;
 

    System.out.println("Defina o tamanho dos vetores.");
    tamanho = entradaPeloTeclado.nextInt();
    int vetor_a[] = new int[tamanho];
    int vetor_b[] = new int[tamanho];
    int vetor_soma[] = new int[tamanho];
      
    // Construção do array a.
    for (posicao_a = 0; posicao_a < tamanho; posicao_a++, posicao_b++, posicao_soma++) {
	System.out.println("Informe o elemento " + posicao_a + " do vetor A: ");
	vetor_a[posicao_a] = entradaPeloTeclado.nextInt();
 
    // Construção do array b.   
	System.out.println("Informe o elemento " + posicao_b + " do vetor B: ");
	vetor_b[posicao_b] = entradaPeloTeclado.nextInt();
 
    // Construção do array soma.   
	System.out.println("Foi adicionado um nome elemento no vetor soma. ");
	vetor_soma[posicao_soma] = (vetor_a[posicao_a] + vetor_b[posicao_b]);

        
		}

	System.out.println("Verifique o conteúdo do vetor soma: ");
//Repetição para mostrar o conteúdo do vetor soma.
    for (posicao_soma = 0; posicao_soma < tamanho ; posicao_soma++) {
	System.out.println("Posição " + posicao_soma + " - Valor: " + vetor_soma[posicao_soma]  );
     }

//Repetição para verificar a igualdade de A e B.
      for (posicao_a = 0,  posicao_b = 0 ; posicao_a < tamanho ; posicao_a++ , posicao_b++){

        if((vetor_a[posicao_a] == vetor_b[posicao_b]) && (posicao_a == posicao_b) ){
        quantidade_iguais++; 

        }
 
        }
    System.out.println("Foram encontrados em A e B " + quantidade_iguais + " números iguais e em posições iguais.");
  }
}

