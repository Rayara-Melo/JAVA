package Poli;

public class Calculadora {
	double soma = 0;
	public void soma(double a, double b) {
		soma = a + b;
		System.out.println(soma);
	}
	public void soma(double a, double b, int c) { //SOBRE CARGA QUANDO TEM ASSINATURAS DIFERENTES E DADOS
		soma = a + b;
		System.out.println(soma);
	}
}
	
