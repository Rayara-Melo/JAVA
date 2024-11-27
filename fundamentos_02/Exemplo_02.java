package fundamentos_02;

import java.util.Scanner;

public class Exemplo_02 {
/* ESCREVA UM PROGRAMA QUE PERGUNTE AO USUÁRIO QUANTOS ALUNOS TEM NA SALA DELE.
 * EM SEGUIDA, ATRÁVES DE UM LAÇO WHILE, PEDE AO USUÁRIO PARA QUE DIGITE AS NOTAS DE TODOS
 * OS ALUNOS DA SALA, UM POR VEZ. POR FIM, O PROGRAMA MOSTRA A MÉDIA ARITMETICA DA TURMA.
 */
	
	public static void main(String[] args) {
	Scanner alunos = new Scanner(System.in);
		int qtdAlunos, cont = 0;
		double notas = 0;  
		double mediaAluno = 0, soma = 0;
		
		System.out.println("Digite a quantidade de alunos na sala: ");
		qtdAlunos = alunos.nextInt();
		
		while (cont < qtdAlunos) {
			System.out.printf("Digite a nota do %d aluno: ", cont+1);
			notas += alunos.nextDouble();
			cont ++;
		}
		mediaAluno = notas/qtdAlunos;
	}
	String mediaAluno;
}
