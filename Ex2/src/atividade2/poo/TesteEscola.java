package atividade2.poo;

public class TesteEscola {

	public static void main(String[] args) {
	
		/* DECLARAR UMA ARRAY:
		 * 
		 * 
		 */
			
		//a
		Curso[] cursos = new Curso[5]; 
		
		cursos[0] = new Curso(1, "Ciência da Computação", 8);
		cursos[1] = new Curso(2, "ADS", 5);
		cursos[2] = new Curso(3, "Redes", 8);	
		cursos[3] = new Curso(4, "Sistemas da Informação", 8);
		cursos[4] = new Curso(5, "Direito", 10);
		
		//b
		Professor[] professores = new Professor[4]; 
		
		professores[0] = new Professor(10, "Paulo", "pg@uol.com.br", "4330-4578");
		professores[1] = new Professor(15, "Alfredo", "am@uol.com.br", "5578-9812");
		professores[2] = new Professor(20, "Marcos", "ms@uol.com.br", "4125-9976");	
		professores[3] = new Professor(25, "Ana", "an@bol.com.br", "5678-1145");
	
		//c
		Disciplina[] disciplinas = new Disciplina[4]; 
		
		disciplinas[0] = new Disciplina(100, "Estatística");
		disciplinas[1] = new Disciplina(110, "Algoritmos");
		disciplinas[2] = new Disciplina(120, "Redes");	
		disciplinas[3] = new Disciplina(130, "Álgebra");
	
		//d
		
		// imprime array curso
		System.out.println("CURSOS\n--------------------");
		for (int i = 0; i < cursos.length; i++)
		{
			cursos[i].ImprimeCurso();
			System.out.println("***********************");
		}
			
		
		// imprime array professor
		System.out.println("PROFESSORES:\n-----------------");
		for (int i = 0; i < professores.length; i++)
		{
			professores[i].ImprimeProfessor();
			System.out.println("***************************");
		}
		
		
		// imprime array disciplinas
		System.out.println("DISCIPLINAS\n--------------");
		for (int i = 0; i < disciplinas.length; i++)
		{
			disciplinas[i].ImprimeDisciplina();
			System.out.println("**********************");
		}
	}		
}
