package usandoMetodoSuper;

public class Gerente extends Funcionario {

	private String CEP;
	
	public Gerente(String nome, String email, String CEP) {
		super(nome, email);
		this.CEP = CEP;
	}
	
	public String ei() {
		return " cad� o relat�rio?";
	}
	
	public String confus() {
		return super.amigo() + super.ola() + ei();
	}
}
