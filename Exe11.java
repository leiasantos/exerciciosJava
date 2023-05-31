package iniciante;

import java.util.Scanner;

public class Exe11 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			int R;
			double numPi, VOLUME;

			
			numPi = 3.14159;
			
			System.out.println("Digite o valor a ser calculado: ");
			R = scan.nextInt();
			
			VOLUME = (4/3.0) * numPi * Math.pow(R, 3);
		
		
		System.out.printf("VOLUME =  %.3f" ,VOLUME);
		}

	}

}
