package iniciante;

import java.util.Scanner;

public class Exe03 {
	
	/*  Soma Simples
	 * Leia dois valores inteiros, no caso para variáveis A e B. 
	 * A seguir, calcule a soma entre elas e atribua à variável SOMA. 
	 * A seguir escrever o valor desta variável.
	 * Entrada
     * O arquivo de entrada contém 2 valores inteiros.
     * Saída
     * Imprima a mensagem "SOMA" com todas as letras maiúsculas
     * com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B. 
     * Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, 
     * caso contrário, você receberá "Presentation Error".
	 * 
	 */

	public static void main(String[] args) {
		
		int A,B, soma;
	
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			A = scan.nextInt();
			

			System.out.println("Digite um segundo número");
			B = scan.nextInt();
		}
		
		soma = A+B;
		

		System.out.println("SOMA = " + soma);
		
		

	}

}
