package Interface;

public class TriAtleta implements Ciclista, Corredor, Nadador {
	public String nome;
	boolean estado = false;
	
	public void aquecer() {
		if (estado == false) {
		System.out.println(nome + " Já está aquecido");
		}else {
			System.out.println(nome + "Aquecendo");
			this.estado = true;
		}
}
	public void pedalar() {
		if (estado == true) {
			System.out.println(nome + " Pedalando");
			}else {
			System.out.println(nome + "Não está preparado");
			}
}
	public void correr() {
		if (estado == true) {
		System.out.println(nome + " Correndo");
		}else {
		System.out.println(nome + "Não está preparado");
		}
}
	public void nadar() {
			if (estado == true) {
			System.out.println(nome + " Nadando");
			}else {
				System.out.println(nome + "Não está preparado");
}
	}
}
