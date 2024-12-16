package Metodos;

public class Carro {
	String  modelo, cor; //ATRIBUTOS TIPO STRING
	double preço; //ATRIBUTOS TIPO DOUBLE 
	boolean ligar, acelerar, frear, desligar;

	public Carro() { //METODO CONTRUSTOR
	}
	public Carro(String m) { //METODO CONTRUSTOR
	this.modelo = m;
	}
	public Carro(String m, String c) { //METODO CONTRUSTOR
	this.modelo = m;
	this.cor = c;
	}
	public Carro(String m, String c, double p) { //METODO CONTRUSTOR
	this.modelo = m;
	this.cor = c;
	this.preço = p;
	}
	public void ligar() { //METODOS
		if (ligar = true) {
		System.out.printf("O carro %S ligou\n", this.modelo); //PRINTAR METODOS
	}else {
		System.out.printf("O carro %S está ligado\n", this.modelo);
	}
}
	public void acelerar() { //METODOS
		if (acelerar = true ) {
		System.out.printf("O carro %S acelerou \n", this.modelo); //PRINTAR METODOS
	}else {
		System.out.printf("O carro %S está desligado \n", this.modelo);
	}
}
	public void frear() { //METODOS
		if (frear = true) {
		System.out.printf("O carro %S freiou\n", this.modelo); //PRINTAR METODOS
	}else {
		System.out.printf("O carro %S está desligado \n", this.modelo);
	}
}
	public void desligar() { //METODOS
		if (desligar = true) {
			System.out.printf("O carro %S está desligado\n", this.modelo); //PRINTAR METODOS
		}else {
	System.out.printf("O carro %S deve ser desligado\n", this.modelo); 
	}
}
}