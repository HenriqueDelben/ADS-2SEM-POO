package atividade2.poo;

public class Curso {
	// nao � boa pr�tica declarar atributos no public
	 public int codCurso;
	 public String descCurso;
	 public int duracaoSemestre;
	 
	 // construtor com passagem de parametros
	 public Curso(int codCurso, String descCurso, int duracaoSemestre) {
		this.codCurso = codCurso;
		this.descCurso = descCurso;
		this.duracaoSemestre = duracaoSemestre;
	}
	 
	 //construtor default - sem passagem de parametros
	 public Curso() {
		 
	 }
	 
	 
	// qual funcao/metodo para captar o valor e armazenar em uma variavel?
	 public void ImprimeCurso() {
		 System.out.println("C�digo do Curso: " + this.codCurso + "");
		 System.out.println("Descri�ao: " + this.descCurso);
		 System.out.println("Duracao do Semestre: " + this.duracaoSemestre);
	 }
	 
}
