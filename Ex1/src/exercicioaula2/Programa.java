package exercicioaula2;

public class Programa {
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(
				"Paulo",
				55123,
				"800912345-12",
				'M',
				7.0,
				6.0,
				8.0
				);
		
		Aluno aluno2 = new Aluno(
				"Ana",
				991239,
				"500876123-15",
				'F',
				2.0,
				6.0,
				9.0
				);
		System.out.println("-----------------------");
		System.out.println("ALUNO 1\n");
		aluno1.ImprimeAluno();
		aluno1.ImprimeSexo();
		System.out.println("Media = " + aluno1.MediaAluno());
		
		System.out.println("----------\nALUNO 2\n");
		aluno2.ImprimeAluno();
		aluno2.ImprimeSexo();
		System.out.println("Media = " + aluno2.MediaAluno());
			
	}
}