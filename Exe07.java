package iniciante;

import java.util.Scanner;

/*
 Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

public class Exe07 {

	public static void main(String[] args) {
		
		int A, B, C, D, resultado;
	  
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um valor");
			A = scan.nextInt();
			
			System.out.println("Digite um segundo valor");
			B = scan.nextInt();
			
			System.out.println("Digite um terceiro valor");
			C = scan.nextInt();
			
			System.out.println("Digite um quarto valor");
			D = scan.nextInt();
		}
		
		resultado = ((A * B ) - (C * D));
		
		System.out.println("DIFERENCA = " + resultado);

	}

}
