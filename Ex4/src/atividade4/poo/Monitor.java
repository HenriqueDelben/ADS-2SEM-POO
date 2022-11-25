package atividade4.poo;

public class Monitor {
	private String numSerie;
	private String fabricante;
	private String cor;
	
	// Construtor c/ parametros
	public Monitor(String numSerie, String fabricante, String cor) {
		this.numSerie = numSerie;
		this.fabricante = fabricante;
		this.cor = cor;
	}
	
	// Construtor default
	public Monitor() {
		
	}
	
	// Getters e Setters
	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void ImprimeMonitor() {
		System.out.println("INFORMAÇÕES DO MONITOR\n-------------");
		System.out.println("Numero de serie: " + this.numSerie);
		System.out.println("Fabricante: " + this.fabricante);
		System.out.println("Cor: " + this.cor);
	}
}
