/* Exercício 03
Prepare um programa para somar os números compreendidos entre 1 e 1000.
Após a leitura, a soma deverá ser apresentada na tela.
*/



public class Exercicio03 {
	public static void main(String[] args) {
		int numero, contador, soma = 0;
		System.out.println("Confira a soma dos números entre 1 e 1000!");
        
    	numero = 2;
    	
	    for (contador = 1; contador <= 998; contador++) {
            soma =  soma + (numero++); 
	    }
	    System.out.println("A soma dos números entre 1 e 1000 é: " + soma);
	}
}
