package Java.poo;

public class Pessoa {

	    String Nome, Endereco; 
		int Idade;

	
		public void comer() {
			System.out.printf("%S Foi comer\n", this.Nome);
				}
		public void dormir() {
			System.out.printf("%S Foi dormir\n", this.Nome);
				}
		public void apresentar() {
			System.out.printf("Meu nome é %S, tenho %d anos, moro em %S.", this.Nome, this.Idade, this.Endereco);
		
		}
		}
		
	


