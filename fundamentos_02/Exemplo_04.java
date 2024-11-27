package fundamentos_02;

public class Exemplo_04 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if (i > 50 && i < 60) {
			continue;
			}
			System.out.println(i);
		}

	}

}
