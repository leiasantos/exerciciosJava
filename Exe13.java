package iniciante;

import java.util.Scanner;

public class Exe13 {

	public static void main(String[] args) {
		
		
		try (Scanner scan = new Scanner(System.in)) {
			int n1, n2, n3;
			

			System.out.println("Digite um número: ");
			n1 = scan.nextInt();

			System.out.println("Digite um segundo número: ");
			n2 = scan.nextInt();
			

			System.out.println("Digite um terceiro número: ");
			n3 = scan.nextInt();
			
			if(n1 > n2 && n1 > n3) {

				System.out.println(n1 + " eh o maior");			
			}
			else if(n2 > n3){

				System.out.println(n2 + " eh o maior");
				
			}
			else {

				System.out.println(n3 + " eh o maior");
				
			}
		}
		
		

	}

}
