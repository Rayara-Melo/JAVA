package Fundamentos_03;

import java.util.Scanner;

public class Exemplo_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o texto: ");
		String texto = scanner.next();
		String resultado = texto.toUpperCase ( );
		System.out.println(resultado);
		

	}

}
