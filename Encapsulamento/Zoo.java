package Encapsulamento;

public class Zoo {

	public static void main(String[] args) {
		Animal A1 = new Animal();
		
		// set para definir os valores
		A1.setIdade(5);
		A1.setDataNascimento("Maio");
		
		
		// get para acessar os valores e mostrar
		System.out.println("Idade do animal: "+ A1.getIdade());
		System.out.println("Data de Nascimento do animal: "+ A1.getIdade());
	}

}
