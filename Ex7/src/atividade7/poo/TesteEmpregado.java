package atividade7.poo;

public class TesteEmpregado {
	
	public static void main(String[] args) {
		
		Empregado pessoa = new Empregado("Antonio", "Rua Brasil, 130", 50, 230);
		
		System.out.println("EMPREGADO\n----------------");
		pessoa.ImprimeEmpregado();
		pessoa.ImprimeSalario();
		
		Gerente gerente = new Gerente("Carlos", "Rua Silvio Torres, 36", 50, 230, "Ana", 2000);
		
		System.out.println("\nGERENTE\n----------------------------");
		gerente.ImprimeGerente();
		gerente.ImprimeSalario();
		
		
	}
}