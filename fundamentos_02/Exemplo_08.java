package fundamentos_02;

import java.util.Scanner ;

public class Exemplo_08 {

	public static void main(String[] args) {
		Scanner alunos = new Scanner(System.in);
		int qtdAlunos;
		double notas = 0;  
		double media = 0, soma = 0;
		
		System.out.println("Quantos alunos tem na sala: ");
		qtdAlunos = alunos.nextInt();
		for(int i = 1 ; i <= qtdAlunos; i++ ) {
			System.out.println("Digite a nota do aluno: ");
			notas+= alunos.nextDouble();
			}
			media = notas/qtdAlunos;
			System.out.printf("A média da sala é %.2f . ", media);
	}
}
