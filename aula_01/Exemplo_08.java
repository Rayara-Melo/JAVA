package aula_01;
import java.util.Scanner;
public class Exemplo_08 {
 
	public static void main(String[] args) {
		double n1,n2,n3;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite o 1 número ");
			n1 = entrada.nextDouble();
			System.out.println("Digite o 2 número ");
			n2 = entrada.nextDouble();
			System.out.println("Digite o 3 número ");
			n3 = entrada.nextDouble();
		}
		
		if (n1>n2) {
			if (n1>n3) {
				System.out.println("N1 é o número maior "+n1);
			}else {
				System.out.println("N3 é o número maior "+n3);
			}
		}else {
			if (n2>n3) {
				System.out.println("N2 é o número maior "+n2);
			}else {
				System.out.println("N3 é o número maior "+n3);
			}
		}
	}

}
