package iniciante;

import java.util.Scanner;

// Exercicio Salario
/*
 * Escreva um programa que leia o número de um funcionário,
 * seu número de horas trabalhadas,
 * o valor que recebe por hora e calcula o salário desse funcionário.
 * A seguir, mostre o número e o salário do funcionário, 
 * com duas casas decimais.
 * 
 * Entrada
 * O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, 
 * representando o número, quantidade de horas trabalhadas e o valor 
 * que o funcionário recebe por hora trabalhada, respectivamente.
 * 
 * Saída
 * Imprima o número e o salário do funcionário, conforme exemplo fornecido, 
 * com um espaço em branco antes e depois da igualdade. 
 * No caso do salário, também deve haver um espaço em branco após o $.
 * 
 * Exemplos de Entrada
 * 25 / 100 / 5.50
 * NUMBER = 25
 * SALARY = U$ 550.00
 * 
 * 1 / 200/ 20.50
 * NUMBER = 1
 * SALARY = U$ 4100.00
 * 
 * 
 */

public class Exe08 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int funcionario;
			int horas;
			double salario, valorHoraTrabalhada;
			

			System.out.println("Digite o número do Funcionario: ");
			funcionario = scan.nextInt();
			

			System.out.println("Digite o número de horas trabalhadas: ");
			horas = scan.nextInt();
			

			System.out.println("Digite o valor por hora trabalhada");
			valorHoraTrabalhada = scan.nextDouble();
			
			salario = horas * valorHoraTrabalhada;
			

			System.out.println("NUMBER = " + funcionario);
			System.out.printf("SALARIO = R$ %.2f ", salario );
		}
		
		System.out.println("");
		
	}

}
