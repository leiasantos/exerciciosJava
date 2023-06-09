package iniciante;

import java.util.Scanner;

/*
 Leia 2 valores de ponto flutuante de dupla precisão A e B, que 
 correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno,
 sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos 
 pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre 
 com uma casa decimal.
 ENTRADA
 O arquivo de entrada contém 2 valores com uma casa decimal cada um.
 SAÍDA
 Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos
 após o ponto decimal e com um espaço em branco antes e depois da igualdade.
 Utilize variáveis de dupla precisão (double) e como todos os problemas, não
 esqueça de imprimir o fim de linha após o resultado, caso contrário, você
 receberá "Presentation Error".
 */
public class Exe05 {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)) {
			double A, B, media;
			
			System.out.println("Digite a  nota");
			A = scan.nextDouble();
			 
			System.out.println("Digite a segunda nota");
			B = scan.nextDouble();
			
			media = ((3.5 * A) + (7.5 * B)) / 11;
			
			System.out.printf("MEDIA = %.5f %n " , media);
			
		}

	}

}
