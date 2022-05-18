/* Exercício 03
Prepare um algoritmo para perguntar a um certo número de pessoas seu nome, sexo, peso e nacionalidade.
Informe:
(a) A média de peso destas pessoas
(b) O nome da pessoa mais pesada
(c) O nome da mulher brasileira mais leve
Parar a execução do algoritmo quando o nome da pessoa for SAIR.
*/


// Perguntar o nome
// Perguntar a o peso
    //Checar se é maior peso
// Perguntar o sexo
// Perguntar nacionalidade
    //checar se brasileira e f;  peso < menor_peso

// soma_altura/contador

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		int contador = 0;
        double peso, maior_peso = 0, menor_peso = Double.MAX_VALUE, soma_peso = 0;
        String nome = new String(), nome_maior_peso = new String(), nome_menor_peso = new String(), nacionalidade = new String();
        char sexo;
		Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("Entre com o nome e altura de 20 pessoas e descubra a média das alturas, a pessoa mais alta e a menor altura registrada!");        
        System.out.println("Informe o nome.");
    	nome = entradaTeclado.next();
        
        while(!nome.equals("SAIR")){

        System.out.println("Informe o peso.");
        peso = entradaTeclado.nextDouble();
        if(peso > maior_peso){
            nome_maior_peso = nome;
            maior_peso = peso;
        }
        System.out.println("Informe a nacionalidade.");
    	nacionalidade = entradaTeclado.next();
        System.out.println("Informe o sexo. [M ou F]");
    	sexo = entradaTeclado.next().charAt(0);
            if (sexo =='F' || sexo == 'f' && nacionalidade == "Brasileira" || nacionalidade == "brasileira"){
                    if(peso < menor_peso){
                        menor_peso = peso;
                        nome_menor_peso = nome;
                        System.out.println(nome_menor_peso);
                        
                    }

            }
        soma_peso = soma_peso + peso;
        contador++;
        System.out.println("Informe o nome.");
    	nome = entradaTeclado.next(); 
        }

        System.out.println("A média das altura é: " + soma_peso/contador);
        System.out.println("A pessoa mais pesada é: " + nome_maior_peso);
        System.out.println("A brasileira com menor peso registrada foi: " + nome_menor_peso);   
    }
}

