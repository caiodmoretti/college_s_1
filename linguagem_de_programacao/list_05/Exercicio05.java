/* Exercício 05
Dado um país A, com 5000000 de habitantes e uma taxa de natalidade de 3% ao ano, e um país B com
7000000 de habitantes e uma taxa de natalidade de 2% ao ano, calcule e imprima o tempo necessário para
que a população do país A ultrapasse a população do país B.
*/

//import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		double populacao_a = 5000000, populacao_b = 7000000  ;
        int tempo = 0;
//		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Descubra em quanto tempo a população do país A irá ultraprassar a população do país B!");
        System.out.println("O país A possui 5.000.000 de habitantes e cresce 3% ao ano.");
        System.out.println("O país B possui 7.000.000 de habitantes e cresce 2% ao ano.");


        
      //Princípio: Por ano: populacao de A cresce 1.03, populacao de B 1.02

    
        while(populacao_b > populacao_a){
            populacao_a = populacao_a * 1.03;
            populacao_b = populacao_b * 1.02;
          //  System.out.println(populacao_a);
          //  System.out.println(populacao_b);
        tempo++;
            
        }
    System.out.println(" A população de A será maior que a população de B em " + tempo + " anos");
      
    }
}

