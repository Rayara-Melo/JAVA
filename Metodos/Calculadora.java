package Metodos;

public class Calculadora  {
	
	public double somar(double a, double b) {
		return a + b;
	}
	public double somar(double a, double b, double c) { //ASSINATURA DE METODOS / PODE CRIAR O MESMO NOME PARA METODO, SÓ REPITE E INCLUIR
		return a + b + c;								//CONJUNTO DE NOMES COM PARAMETROS
	}
	public double subtracao(double a, double b) {
		return a - b;
	}
	public double multiplicacao(double a, double b) {
		return a * b;
	}
	public double divisao(double a, double b) {
		return a / b;
	}
}