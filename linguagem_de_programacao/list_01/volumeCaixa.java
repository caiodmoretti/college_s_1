import java.util.Scanner;

public class volumeCaixa{ 

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Double comprimento , altura , largura , volume ;
        System.out.println(" Descubra o Volume da Caixa d'água! ");
          System.out.print("Entre com o Comprimento:");
          comprimento = leia.nextDouble();
          System.out.print("Entre com a Altura:");
        altura = leia.nextDouble();
        System.out.print("Entre com a Largura:");
          largura = leia.nextDouble();
        volume = comprimento * altura * largura;
        System.out.println(" O Volume da Caixa d'água é: " + volume);

    }
}