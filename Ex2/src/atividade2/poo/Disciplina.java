package atividade2.poo;

public class Disciplina {
	 public int codDisciplina;
	 public String descDisciplina;
	 
	public Disciplina(int codDisciplina, String descDisciplina) {
		this.codDisciplina = codDisciplina;
		this.descDisciplina = descDisciplina;
	}
	
	// Construtor Default
	public Disciplina() {
		
	}
	
	 public void ImprimeDisciplina() {
		 
		 System.out.println("C�digo da Disciplina: " + this.codDisciplina);
		 System.out.println("Descri��o da Disciplina: " + this.descDisciplina);
	 }
	
}
	