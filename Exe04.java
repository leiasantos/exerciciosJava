package iniciante;

import java.util.Scanner;

/*
 * Produto Simples
 * Leia dois valores inteiros.
 * A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
 * A seguir mostre a variável PROD com mensagem correspondente.   
 * Entrada
 * O arquivo de entrada contém 2 valores inteiros.
 * Saída
 * Imprima a mensagem "PROD" e a variá depois da igualdade. Não esqueça de imprimir o fim de linha após o produto,
 * caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 * 
 */

public class Exe04 {

	public static void main(String[] args) {
		
	try (Scanner scan = new Scanner(System.in)) {
		int n1, n2;
		int resultado;
		
		
		System.out.println("Digite um número");
		n1 = scan.nextInt();
		
		
		System.out.println("Digite um segundo número");
		n2 = scan.nextInt();
		
		
   
		resultado = (n1 * n2);
		
		
		System.out.println("PROD = " + resultado);
	}
		
	
		
	
		
	
	}

}
