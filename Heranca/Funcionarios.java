package Heranca;

public class Funcionarios extends Pessoa {

	public Funcionarios() {
		double salario;
	}
	public Funcionarios(String nome, String cpf, String telefone) {
		super(nome, cpf, telefone);
	}
	public void dever() {
		System.out.println("Devendo até a alma");
	}
	public void receber() {
		System.out.println("Preciso de DIDI");
	}

}
