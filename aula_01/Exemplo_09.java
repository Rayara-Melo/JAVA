package aula_01;
	import java.util.Scanner;
public class Exemplo_09 {

	public static void main(String[] args) {
		int day;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Digite um número entre 1 e 7");
			day = entrada.nextInt();
		}
		
		switch(day) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Inválido");
		}
	}

}
