package aula_01;
import java.util.Scanner;
public class Exemplo_12 {

	public static void main(String[] args) {
// FAÇA UM PROGRAMA QUE FAÇA 5 PERGUNTAS PARA UMA PESSOA SOBRE UM CRIME. AS PERGUNTAS SÃO:
// O PROGRAMA DEVE NO FINAL EMITIR UMA CLASSIFICAÇÃO SOBRE A PARTICIPAÇÃO DA PESSOA NO CRIME
//SE A PESSOA RESPONDER POSITIVAMENTE A 2 QUESTÕES ELA DEVE SER CLASSIFICADA COM "SUSPEITA", 
// ENTRE 3 E 4 COMO "CÚMPLICE"  E 5 COMO "ASSASSINO". CASO CONTRÁRIO, ELE SERÁ CLASSIFICADO
// COMO "INOCENTE".
//PERGUNTAS: TELEFONOU PARA A VÍTIMA - ESTEVE NO LOCAL DO CRIME - MORA PERTO DA VÍTIMA - DEVIA PARA VITMA - 
		//JÁ TRABALHOU COM A VITIMA
		
	
		try (Scanner scanner = new Scanner(System.in)) {
			int v = 0;

			  System.out.println("Responda às seguintes perguntas com '1' ou '0':");

			  System.out.println("Telefonou para a vítima? 1 de verdade  ");
			  
			  v += scanner.nextInt();
				  
			  
			  System.out.println("Esteve no local do crime?1 de verdade ");
			  
			  v += scanner.nextInt();
			  
			  System.out.println("Mora perto da vítima?1 de verdade  ");
			  
			  
			  v += scanner.nextInt();
			
			  System.out.println("Devia para a vítima?1 de verdade  ");
			  
			  v += scanner.nextInt();
			  
			  
			  System.out.println("Já trabalhou com a vítima?1 de verdade ");
			 
			  
			  v += scanner.nextInt();
			  
			  
			  if (v==2 ) {
				  System.out.println("ele é o suspeito.");
			  }else {
				   if (v >= 3 && v <= 4) {

					System.out.println("Cúmplice");
				  
			  }else {
				  if (v == 5) {
						System.out.println("Assassino");
						
			  }else {
						System.out.println("Inocente");
			  }
			    
			  

			  }
}
		}
		  }
}