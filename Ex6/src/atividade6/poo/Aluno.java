package atividade6.poo;

public class Aluno extends Pessoa {
    
    private int codMatricula;
    private double p1;
    private double p2;
    private int qntdFaltas;

    public Aluno(String nome, String endereço, String cpf, String rg, int codMatricula, double p1, double p2, int qntdFaltas) {

        super(nome, endereço, cpf, rg);
        this.codMatricula = codMatricula;
        this.p1 = p1;
        this.p2 = p2;
        this.qntdFaltas = qntdFaltas;
    }

    // Construtor Default
    public Aluno() {

    }

    // Construtor Clone
    public Aluno(Aluno aluno) {
        super(aluno.getNome(), aluno.getEndereço(), aluno.getCpf(), aluno.getRg());
        this.codMatricula = aluno.codMatricula;
        this.p1 = aluno.p1;
        this.p2 = aluno.p2;
        this.qntdFaltas = aluno.qntdFaltas;
    }

    // Getter codMatricula
    public int getCodMatricula() {
        return this.codMatricula;
    }

    // Getter P1
    public double getP1() {
        return this.p1;
    }

    // Getter P2
    public double getP2() {
        return p2;
    }

    // Getter qntdFaltas
    public int getQndtFaltas() {
        return this.qntdFaltas;
    }

    // Setter codMatricula
    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }

    // Setter P1
    public void setP1(double p1) {
        this.p1 = p1;
    }

    // Setter P2
    public void setP2(double p2) {
        this.p2 = p2;
    }

    // Setter qntdFaltas
    public void setQndtFaltas(int qntdFaltas) {
        this.qntdFaltas = qntdFaltas;
    }

    public void ImprimeAluno() {
        System.out.println("-----------------------------------");
        super.ImprimePessoa();
        System.out.println("Codigo de matricula: " + this.codMatricula);
        System.out.println("Nota P1: " + this.p1);
        System.out.println("Nota P2: " + this.p2);
        System.out.println("Quantidade de faltas: " + this.qntdFaltas);   
    }

    public void ImprimeFaltas() {
        System.out.println("Aluno" + super.getNome());
        System.out.println("Total de faltas: " + this.qntdFaltas);
    }

    public String Resultado() {
        System.out.println("Resultado: ");
        if (this.qntdFaltas >= 10) return "Reprovado";
        if ((p1 + p2) / 2 < 3) return "Reprovado";
        if ((p1 + p2) / 2 < 7) return "Em exame";

        return "Aprovado";
    }
}
