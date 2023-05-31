package iniciante;

import java.util.Scanner;

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
			
			System.out.printf(nome +  "\n" + "TOTAL = R$ %.2f " ,(total));
		}
		
	
	
	
	}

}
