package Metodos;

public class Honda extends Carro { //"extends" é HERANÇA, UMA EXTENSÃO DE UMA CLASSE QUE VEM JUNTO METODOS
	
		public Honda() {
		String  modelo, cor; //ATRIBUTOS TIPO STRING
		double preço; //ATRIBUTOS TIPO DOUBLE 
		}
		
		public Honda(String m) { //METODO CONTRUSTOR
		this.modelo = m;
		}
		public Honda(String m, String c) { //METODO CONTRUSTOR
		this.modelo = m;
		this.cor = c;
		}
		public Honda(String m, String c, double p) { //METODO CONTRUSTOR
		this.modelo = m;
		this.cor = c;
		this.preço = p;

}
}