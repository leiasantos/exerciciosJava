package iniciante;

/* Cálculo Simples
 Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
 o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 Após, calcule e mostre o valor a ser pago.
 Entrada
 O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
 respectivamente dois inteiros e um valor com 2 casas decimais.
 
 Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, 
o, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
O valor deverá ser apresentado com 2 casas após o ponto.
Exemplos de Entrada:
12 1 5.30   / 16 2 5.10 
VALOR A PAGAR: R$ 15.50


13 2 15.30 / 161 4 5.20
VALOR A PAGAR: R$ 51.40

1 1 15.10  /  2 1 15.10
VALOR A PAGAR: R$ 30.20

 */

import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			double peca1, peca2, codigo1, codigo2;
			double valor, valor1, valor2;

			codigo1 = scan.nextDouble();
			peca1 = scan.nextDouble();
			valor1 = scan.nextDouble();

			codigo2 = scan.nextDouble();
			peca2 = scan.nextDouble();
			valor2 = scan.nextDouble();

			valor = ((peca1 * valor1) + (peca2 * valor2));

			System.out.printf("VALOR A PAGAR: R$ %.2f", valor);
		}
	}

}
