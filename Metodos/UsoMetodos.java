package Metodos;

import java.util.Scanner;

public class UsoMetodos {

	public static void main(String[] args) {
		JavaMetodos j1 = new JavaMetodos();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Em que ano voçe nasceu? ");		
		int ano = entrada.nextInt();
		System.out.println(j1.idade(ano));
	
		JavaMetodos j2 = new JavaMetodos();
		System.out.println("Quantas horas voçê trabalho? ");
		int horas = entrada.nextInt();
		System.out.println("Valor do custo: ");
		double custos = entrada.nextDouble();
		double resultado = j2.valor(horas,custos);
		System.out.println(resultado);
	}

}
