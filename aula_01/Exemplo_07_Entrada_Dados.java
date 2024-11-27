package aula_01;
	import java.util.Scanner;
public class Exemplo_07_Entrada_Dados {
	
	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite um numero:");
			double resposta = entrada.nextDouble();
			System.out.println("O número foi "+resposta);
		}
		
	}

}
