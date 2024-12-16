package Metodos;

public class TesteCalculadora {

	public static void main(String[] args) {
		Calculadora c1 = new Calculadora();//METODO CONTRUSTOR
		
		//SOMAR
		double resp = c1.somar(4.5, 100.45);
		System.out.println(resp);
		
		//SOMAR COM UM NOVO PARAMETRO, PODE SER USADO REPETIDO O NOME DO MESMO METODO E INCLUIR UM NOVO PARAMETRO
		resp = c1.somar(3, 5.6, 5.5);
		System.out.println(resp);
		
		//SUBTRACAO
		resp = c1.subtracao(5.5, 8);
		System.out.println(resp);
		
		//MULTIPLICACAO
		resp = c1.multiplicacao(8,  5.1);
		System.out.println(resp);
		
		//DIVISAO
		resp = c1.divisao(6.3,  6);
		System.out.println(resp);
		
	}
	
		
				
		

	}


