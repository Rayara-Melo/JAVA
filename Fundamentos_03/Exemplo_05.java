package Fundamentos_03;

import java.util.Scanner;

public class Exemplo_05 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
								
				System.out.println("Digite a palavra: ");
				String palavra = scanner.next();
				int tam = palavra.length();
				System.out.println(tam);
	}

}
