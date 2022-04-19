/*Exercício 04
Escreva um programa que leia um peso na Terra, o número de um planeta e imprima o valor do peso neste planeta. A relação de planetas  ́e dada a seguir juntamente com o valor das gravidades relativas à Terra.

As informações deverão ser lidas pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/
import java.util.Scanner;

public class GravidadeRelativa {
	public static void main(String[] args) {
		float peso;
        int numero;
		Scanner leia = new Scanner(System.in);
        System.out.print("Informe seu peso:");
		peso = leia.nextFloat();
		System.out.print("Entre com o número do planeta [1 a 6]:");
		numero = leia.nextInt();
		switch (numero) {
			case 1: System.out.println("Você escolheu Mercúrio. Lá, seu peso é: " + peso*0.37);
					break;
			case 2: System.out.println("Você escolheu Vênus. Lá, seu peso é: " + peso*0.88);
                    break;
			case 3:	System.out.println("Você escolheu Marte. Lá, seu peso é: " + peso*0.38);
					break;
			case 4:	System.out.println("Você escolheu Júpiter. Lá, seu peso é: " + peso*2.64);
                    break;
			case 5:	System.out.println("Você escolheu Saturno. Lá, seu peso é: " + peso*1.15);
					break;
			case 6:	System.out.println("Você escolheu Urano. Lá, seu peso é: " + peso*1.17);
					break;
			default:System.out.println("Este número não é válido!");
		}   
	}
}
