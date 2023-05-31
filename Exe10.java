package iniciante;


import java.util.Scanner;

public class Exe10 {

	public static void main(String[] args) {
		
	  try (Scanner scan = new Scanner(System.in)) {
		double peca1, peca2, codigo1, codigo2 ;
	     double valor, valor1, valor2;
		  
		  
		  codigo1 = scan.nextDouble();
		  peca1 = scan.nextDouble();
		  valor1 = scan.nextDouble();
		  
		
		  codigo2 = scan.nextDouble();
		  peca2 = scan.nextDouble();
		  valor2 = scan.nextDouble();
		  
		    
		  valor = ((peca1 * valor1) + (peca2 * valor2));
		  
		  System.out.printf("VALOR A PAGAR: R$ %.2f", valor );
	}
  }

}
