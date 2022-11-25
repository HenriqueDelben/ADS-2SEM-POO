package atividade7.poo;

public class Gerente extends Empregado {
	private String secretaria;
	private double salarioBonus;
	
	// Construtor com parâmetros
	public Gerente(String nome, String endereço, double valorHoras, int qntdHoras, String secretaria, double salarioBonus) {
		
		super(nome, endereço, valorHoras, qntdHoras);
		this.secretaria = secretaria;
		this.salarioBonus = salarioBonus;
	}
	
	// Construtor Sem parametros 
	public Gerente() {
		
	}
	
	// Construtor que constroi um objeto da classe Gerente a partir de outro objeto da classe Gerente (clone)
	public Gerente(Gerente g1) {
		
		super(g1.getNome(), g1.getEndereço(), g1.getValorHoras(), g1.getQntdHoras());
		this.secretaria = g1.secretaria;
		this.salarioBonus = g1.salarioBonus;
	}
	
	public void ImprimeGerente() {
		super.ImprimeEmpregado();
		System.out.println("Secretaria: " + this.secretaria);
		System.out.println("Salario bonus: " + this.salarioBonus);
	}
	
	public double calculaSalario() {
		return super.calculaSalario() + this.salarioBonus;
	}
	
	public void ImprimeSalario() {
		
		System.out.println("Nome: " + super.getNome());
		System.out.println("Salario: " + this.calculaSalario());
	}
}