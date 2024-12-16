package Metodos;

public class JavaMetodos {

	public int idade(int ano) {
		int idade = 2024 - ano;
		return 25;
	}		
	public double valor(int horas, double custo) {
		double retorno = horas*custo;
		return retorno;
	}
	public String nome(String valor) {
		return "Rayara";
	}
	public boolean estado(int anos) {
		boolean resposta;	
		if (anos > 3) {
			resposta = true;
	}else {
		resposta = false;
	}
		return resposta;
}
}