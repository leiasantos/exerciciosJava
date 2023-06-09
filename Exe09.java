package iniciante;

import java.util.Scanner;

/*  Salário com Bônus
 * Faça um programa que leia o nome de um vendedor, 
 * o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
 * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 * informar o total a receber no final do mês, com duas casas decimais.
 * Entrada
 * O arquivo de entrada contém um texto (primeiro nome do vendedor) e 
 * 2 valores de dupla precisão (double) com duas casas decimais, 
 * representando o salário fixo do vendedor e montante total das vendas efetuadas 
 * por este vendedor, respectivamente.
 * Saída
 *Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
 *
 *Exemplos de Entrada
 *JOAO   / 500.00  /  1230.30
 *TOTAL = R$ 684.54
 *
 *PEDRO / 700.00/ 0.00
 *TOTAL = R$ 700.00
 *
 *
 * 
 */

public class Exe09 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			String nome;
			double salario, totalVendas, total;

			System.out.println("Digite o nome do Vendedor: ");
			nome = scan.next();

			System.out.println("Digite o valor do Salario: R$ ");
			salario = scan.nextDouble();

			System.out.println("Total das vendas efetuadas no mês: ");
			totalVendas = scan.nextDouble();

			total = salario + totalVendas * 0.15;

			System.out.printf(nome + "\n" + "TOTAL = R$ %.2f ", (total));
		}

	}

}
