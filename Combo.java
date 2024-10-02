
public class Combo {
	private Burguer burguer;
	private Sobremesa sobremesa;
	private Bebida bebida;
	
	
	public void criarCombo(int tipo) {
		switch(tipo) {
		
		case 1:
			burguer = new Burguer("CheeseBurguer");
			sobremesa = new Sobremesa("Sorvete");
			bebida = new Bebida("Refrigerante");
			break;
		case 2:
			burguer = new Burguer("BaconBurguer");
			sobremesa = new Sobremesa("Churros");
			bebida = new Bebida("Suco");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
			
		}
	}
		@Override
		public String toString() {
			return 
				   "\nBurguer: " + burguer.getNome() + "\n" +
				   "Sobremesa: " + sobremesa.getNome() + "\n" +
				   "Bebida: " + bebida.getNome();
		}
}
