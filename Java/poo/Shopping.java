package Java.poo;

public class Shopping {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(); // puxando a classe e atribuir a um "objeto"
		Pessoa p2 = new Pessoa();
		p2.Nome = "Tricolor milionario"; //atribuir valor a variavel
		p1.Nome = "turista";
		p1.Idade = 30; //atribuir o valor a variavel
		p2.Idade = 46;
		p1.dormir(); // os () é para apresentar na tela
		p2.dormir();
		p1.comer();
		p2.comer();
		p1.Endereco = "Rua do guia";
		p2.Endereco = "Rua do Frevo";
		p1.apresentar();

	}

}
