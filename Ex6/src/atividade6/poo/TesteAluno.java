package atividade6.poo;

public class TesteAluno {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("José", "Rua Antonio Marques, 30", "568.234.981-15", "3.698.222-8");

        p1.ImprimePessoa();

        Aluno a1 = new Aluno("Pedro", "Rua Almeida, 20", "456.876.123-12", "4.687.098-2", 59751, 4.5, 8.0, 10);

        a1.ImprimeAluno();
        System.out.println(a1.Resultado());

        Aluno a2 = new Aluno(a1);
        a2.setNome("Francisco");
        a2.setP1(4.0);
        a2.setP2(4.5);
        a2.ImprimeAluno();
        System.out.println(a2.Resultado());

        a2.setQndtFaltas(11);
        System.out.println(a2.Resultado());
        
        
        a2.setP1(8.0);
        a2.setP2(9.5);
        System.out.println(a2.Resultado());

    }
}
