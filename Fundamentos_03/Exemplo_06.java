package Fundamentos_03;

public class Exemplo_06 {

	public static void main(String[] args) {
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		
		System.out.println(texto01.compareTo("Será que são iguais?") == 0 ? true : false);
		System.out.println(texto02.compareTo("Será que são iguais?") == 0 ? true : false);
		
	}

}
