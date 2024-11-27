package fundamentos_02;

import java.util.Scanner;

public class Exemplo_03 {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			int n = 0, cont = 0;
			
			System.out.println("Digite um número: ");
			n = entrada.nextInt();
			
			while (cont < n) {
				
				if	(n % 2 != 0){
					System.out.print(n);
			
			}
				n++;
			}
		}
		
	
	}

}
