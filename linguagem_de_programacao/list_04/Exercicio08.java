/* Exercício 08
Se tivermos uma lista dos números naturais menores do que 10 que são múltiplos de 3 ou 5 obtemos 3, 5, 6 e 9. A soma destes múltiplos é 23. Imprima a soma dos múltiplos de 3 ou 5 menores do que 1000.
Após a inicialização, a soma deverá ser apresentada na tela.
*/



public class Exercicio08 {
	public static void main(String[] args) {
		int  contador, soma = 0;

		System.out.println("Encontre a soma dos números naturais menores que 1000 e múltiplos de 3 e 5!");

    contador = 1;
    while (contador < 1000)
        {
                
                if( contador % 3 == 0 || contador % 5 == 0 ){
                soma = soma + contador;
                    }
            
                contador++;
                       
        }
    System.out.println("A soma dos números naturais menores que 1000 e múltiplos de 3 e 5 é: "+ soma);
      
    }
}
