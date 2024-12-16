package Heranca;

public class Professor extends Pessoa {
	double Salario; //todo classe em java tem pelo menos dois metodos, um vazio que não recebe nada e uns outros uns parametros
	
	public Professor(String nome, String cpf, String telefone) { // O metodo construtor tem o mesmo nome da classe
		super(nome, cpf, telefone);
		
	}
	public void aplicarProva() { // nome de metodo primeira letra minuscula e apartir da segunda coloca maiuscula
		System.out.println("Aplicando a prova");
	}
	public void certificarAluno() {
	System.out.println("Certificando");
	}

}
