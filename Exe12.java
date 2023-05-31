package iniciante;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {
			
	try (Scanner scan = new Scanner(System.in)) {
		double A, B, C;
		double trianguloRetangulo, circulo, trapezio, quadrado, retangulo;
	
		System.out.println("Digite o valor de A: ");
		A = scan.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		B = scan.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		C = scan.nextDouble();
		
		trianguloRetangulo = A * C / 2;
		circulo = 3.14159 * (C * C);
		trapezio = ((A + B) * C) / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f \n" , trianguloRetangulo);
		System.out.printf("CIRCULO: %.3f \n" , circulo);
		System.out.printf("TRAPEZIO:  %.3f \n" , trapezio);
		System.out.printf("QUADRADO: %.3f \n" , quadrado);
		System.out.printf("RETANGULO:  %.3f " , retangulo);
	}
		
	
	}

}
