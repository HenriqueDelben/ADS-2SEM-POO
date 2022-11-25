package atividade2.poo;

public class Professor {
	public int codProfessor;
	public String nomeProf;
	public String emailProf;
	public String foneProf;
	
	// Construtor com parâmetros
	public Professor(int codProfessor, String nomeProf, String emailProf, String foneProf) {
		super();
		this.codProfessor = codProfessor;
		this.nomeProf = nomeProf;
		this.emailProf = emailProf;
		this.foneProf = foneProf;
	}
	
	// Construtor default
	public Professor() {
		
	}
	
	public void ImprimeProfessor() {
		 
		 System.out.println("Código do professor: " + this.codProfessor);
		 System.out.println("Nome do Professor: " + this.nomeProf);
		 System.out.println("E-mail do professor: " + this.emailProf);
		 System.out.println("Telefone do Professor: " + this.foneProf);	 
	 }
	
	
}
