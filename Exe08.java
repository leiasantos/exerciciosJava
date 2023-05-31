package iniciante;

import java.util.Scanner;

// Exercicio Salario

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
