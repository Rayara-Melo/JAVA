package aula_01;
	import java.util.Scanner;
public class Exemplo_10 {

	public static void main(String[] args) {
		double nota1, nota2, media;
		try (Scanner entrada = new Scanner(System.in)) {
			// recebe a 1º nota
            System.out.println("Digite sua 1ª nota: ");
            nota1 = entrada.nextInt();
            
            // recebe a 2º nota
            System.out.println("Digite sua 2ª nota: ");
            nota2 = entrada.nextInt();
		}
		
            // calcula a média e mostra a nota do aluno
            media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno é:  "+media);
            
                  
            }
               
    }


	


