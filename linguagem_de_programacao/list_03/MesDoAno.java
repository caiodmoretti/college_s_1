/*Exercício 03
Criar um programa que leia um número inteiro entre 1 e 12 e escreva o nome do mês correspondente. Caso o usuário digite um número fora desse intervalo, dever ́a aparecer uma mensagem informando que não existe mês com este número.
As informações deverão ser lidas pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/
import java.util.Scanner;

public class MesDoAno {
	public static void main(String[] args) {
		int numero;
		Scanner leia = new Scanner(System.in);

		System.out.print("Entre com o número do mês [1 a 12]:");
		numero = leia.nextInt();
		switch (numero) {
			case 1: System.out.println("Janeiro.");
					break;
			case 2:	System.out.println("Fevereiro.");
					break;
			case 3:	System.out.println("Março.");
					break;
			case 4:	System.out.println("Abril.");
					break;
			case 5:	System.out.println("Maio.");
					break;
			case 6:	System.out.println("Junho");
					break;
			case 7:	System.out.println("Julho");
					break;
			case 8: System.out.println("Agosto.");
					break;
			case 9: System.out.println("Setembro.");
					break;
			case 10: System.out.println("Outubro.");
					break;
            case 11: System.out.println("Novembro.");
					break;
			case 12: System.out.println("Dezembro.");
					break;
			default:System.out.println("Este número não é válido!");
		}   
	}
}
