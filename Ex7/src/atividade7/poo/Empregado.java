package atividade7.poo;

public class Empregado {
	private String nome;
	private String endereço;
	private double valorHoras;
	private int qntdHoras;
	
	// Construtores
	public Empregado(String nome, String endereço, double valorHoras, int qntdHoras) {
		
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.valorHoras = valorHoras;
		this.qntdHoras = qntdHoras;
	}
	
	public Empregado() {
		
	}
	
	// Métodos Getter e Setter
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return this.endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public double getValorHoras() {
		return this.valorHoras;
	}

	public void setValorHoras(double valorHoras) {
		this.valorHoras = valorHoras;
	}
	
	public int getQntdHoras() {
		return this.qntdHoras;
	}

	public void setQntdHoras(int qntdHoras) {
		this.qntdHoras = qntdHoras;
	}

	// Métodos 
	public void ImprimeEmpregado() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereço);
		System.out.println("Valor de horas de trabalho: " + "R$" + this.valorHoras);
		System.out.println("Quantidade de horas trabalhadas: " + this.qntdHoras);
	}
	
	public double calculaSalario() {
		
		return (this.valorHoras * this.qntdHoras);
	}
	
	public void ImprimeSalario() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.calculaSalario());
	}
}