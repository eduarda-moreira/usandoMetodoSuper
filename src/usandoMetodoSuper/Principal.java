package usandoMetodoSuper;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa("Vivian:");
		Funcionario f1 = new Funcionario("Marçal:", "moreiraeduarda.ms@gmail.com");
		Gerente g1 = new Gerente ("Sabiá:", "moreiraeduarda.ms@gmail.com", "08528000");
		
		System.out.println(p1.getNome() + p1.oi());
		System.out.println(f1.getNome() + f1.ola());
		System.out.println(g1.getNome() + g1.ei());
		System.out.println(f1.getNome() + f1.amigo());
		System.out.println(g1.getNome() + g1.confus());
		}
}
