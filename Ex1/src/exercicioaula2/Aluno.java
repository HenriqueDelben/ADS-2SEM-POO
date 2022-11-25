package exercicioaula2;

import java.util.Arrays;

public class Aluno {
	public String nome;
	public int codmat;
	public String cpf;
	public char sexo;
	public double notaP1;
	public double notaP2;
	public double notaP3;
	
	public Aluno(String nome, int codmat, String cpf, char sexo, double notaP1, double notaP2, double notaP3) {
		// super() - herança;
		this.nome = nome;
		this.codmat = codmat;
		this.cpf = cpf;
		this.sexo = sexo;
		this.notaP1 = notaP1;
		this.notaP2 = notaP2;
		this.notaP3 = notaP3;
	 // objeto.atributo = parametro do construtor Aluno da classe Aluno	
	}
	
	public void ImprimeAluno () {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Código de matricula: " + this.codmat);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Nota P1: " + this.notaP1);
		System.out.println("Nota P2: " + this.notaP2);
		System.out.println("Nota P3: " + this.notaP3);
	}
	public void ImprimeSexo () {
		
		if (this.sexo == 'M')
		{
			System.out.println("Masculino");
		}
		else
		{
			System.out.println("Feminino");
		}
	}
	
	public double MediaAluno()
	{
		double [] tabnotas = new double [3];
		
		tabnotas [0] = this.notaP1;
		tabnotas [1] = this.notaP2;
		tabnotas [2] = this.notaP3;
		Arrays.sort(tabnotas);
		
		return (tabnotas[1] + tabnotas[2]) / 2;
	}
	
	public void Resultado() {
		
		if (this.MediaAluno() >= 6){
			System.out.println("Aprovado");
		}
		else
		{
			System.out.println("Reprovado");
		}
	}
}



