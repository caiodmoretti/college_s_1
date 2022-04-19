/* Exercício 02
Tendo como dados de entrada a altura o sexo e o peso de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
. Para homens: (72.7*h) - 58
. Para mulheres: (62.1*h) - 44.7 (h = altura)
Informe se o peso da pessoa está dentro, acima ou abaixo do peso (Considere a margem de erro de 1 Kg para mais ou para menos como estando no peso ideal).
As informações deverão ser lidas pelo teclado.
Após a leitura, a verificação deverá ser apresentada na tela.
*/

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner ;

public class PesoIdeal {

    public static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
    Scanner leia = new Scanner ( System .in );
    double peso, peso_ideal, altura ; // Declaração de variáveis
    String sexo;

    System.out.println("Verifique se você está com o seu peso ideal.");
    System.out.println("Informe seu sexo. [Masculino ou Feminino]");
    sexo = leia.nextLine();
    System.out.println("Informe sua altura.");
    altura = leia.nextDouble();
    System.out.println("Informe seu peso.");
    peso = leia.nextDouble();

    if (sexo.equals("Masculino")){
        peso_ideal  = (72.7*altura - 58);

        if (peso > (peso_ideal+1)){
            System.out.println("Seu peso ideal é: "+  df.format(peso_ideal) +" " + "Você está acima do ideal.");    
        }
        if (peso >= (peso_ideal-1) && peso <= (peso_ideal+1)){
            System.out.println("Seu peso ideal é: "+  df.format(peso_ideal) +" "+ "Você está dentro do ideal.");    
        }
        if (peso < (peso_ideal-1)){
           System.out.println("Seu peso ideal é: "+  df.format(peso_ideal)+" " +"Você está abaixo do ideal.");    
       }
        
    }
    if (sexo.equals("Feminino")){
        peso_ideal  = (62.1*altura - 44.7);

        if (peso > (peso_ideal+1)){
            System.out.println("Seu peso ideal é: "+  df.format(peso_ideal) +" " + "Você está acima do ideal.");    
        }
        if (peso >= (peso_ideal-1) && peso <= (peso_ideal+1)){
            System.out.println("Seu peso ideal é: "+  df.format(peso_ideal) +" "+ "Você está dentro do ideal.");    
        }
        if (peso < (peso_ideal-1)){
           System.out.println("Seu peso ideal é: "+  df.format(peso_ideal)+" " +"Você está abaixo do ideal.");    
       }
        
    }
    
        
    }
}
