package fundamentos_02;

import java.util.Scanner;

public class Exemplo_12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] A = new int [4];
		int[] B = new int [4];
		int[] C = new int [4];
		int[] D = new int [4];
		
		for (int x = 0; x < 4; x++) {
			System.out.println("Digite o valor da array A: ");
			A[x] = entrada.nextInt();
		}
		for (int x = 0; x < 4; x++) {
			System.out.println("Digite o valor da array B: ");
			B[x] = entrada.nextInt();
		}
		for (int x = 0; x < 4; x++) {
			System.out.println("Digite o valor da array C: ");
			C[x] = entrada.nextInt();
		}
		for (int x = 0; x < 4; x++) {
			System.out.println("Digite o valor da array D: ");
			D[x] = entrada.nextInt();
		}
		
		for(int i: A) {
			System.out.println(i+" ");
		}
		System.out.println();
		for(int i: B) {
			System.out.println(i+" ");
		}
		System.out.println();
		for(int i: C) {
			System.out.println(i+" ");
		}
		System.out.println();
		for(int i: D) {
			System.out.println(i+" ");
		}
		
		
		
			

	}

}
