package aula_01;

import java.util.Scanner;

public class Exemplo_11 {

	public static void main(String[] args) {
	//Faça um Programa que verifique se uma letra digitada é "F" ou "M"//
		//Conforme a letra escrever: F - Feminino, M - Masculino.
		//
		
		char g;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe seu sexo - F/f(feminino) , M/m(masculino):");
		g = entrada.next().charAt(0); 
		
		if (g == 'F'|| g == 'f') {
			System.out.println("sexo feminino!");
		}else {
			if (g == 'M' || g == 'm') 
				System.out.println("sexo masculino!");
			else  
			System.out.println("sexo Invalido!");
		}
	}
}

	


