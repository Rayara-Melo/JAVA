package Heranca;

public class Escola {

	public Escola() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Aluno a1 = new Aluno ("Maria", "123456789","9999999"); //A classe e o metodo tem o mesmo nome, no metodo CONSTRUTOR
		a1.sofrer();
		Professor p1 = new Professor("José", "321654987","99889988");
		p1.aplicarProva();
	}

}
