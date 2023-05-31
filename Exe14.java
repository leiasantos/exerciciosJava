package iniciante;

import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		double distancia, totalCombus, consumo;

		System.out.println("Digite o valor da distancia em Km");
		distancia = scan.nextDouble();
		

		System.out.println("Digite o gasto de combustivel");
		totalCombus = scan.nextDouble();
		
		
		consumo = (distancia / totalCombus);
		

	     System.out.print(consumo + "%.2f Km/Litro\n");
		
		
		
	}

}
