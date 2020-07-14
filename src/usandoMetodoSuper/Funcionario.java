package usandoMetodoSuper;

public class Funcionario extends Pessoa {
	private String email;
		
	public String getEmail() {
		return this.email;
	}

	public Funcionario(String nome, String email) {
		super (nome);
		this.email = email;
	}
	
	public String ola() {
		return " bom dia!";
	}
	
	public String amigo() {
		return super.oi();
	}
}
