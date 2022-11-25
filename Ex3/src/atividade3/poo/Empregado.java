package atividade3.poo;

public class Empregado {
    private int codEmpregado;
    private String nome;
    private String cargo;
    private String salario;
    private static int contagem = 0;

    // construtor com parametros
    public Empregado(int codEmpregado, String nome, String cargo, String salario) {
        this.codEmpregado = codEmpregado;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        
        contagem++;
    }
    // construtor sem parametros (default)
    public Empregado() {
        contagem++; // variavel da classe para armazenar a quantidade de objetos criados para esta classe
    }

    //getter codEmpregado
    public int getCodEmpregado() {
        return codEmpregado;
    }
    //getter nome
    public String getNome() {
        return nome;
    }
    //getter cargo
    public String getCargo() {
        return cargo;
    }
    //getter salário
    public String getSalario() {
        return salario;
    }
    //setter codEmpregado
    public void setCodEmpregado(int codEmpregado) {
        this.codEmpregado = codEmpregado;
    }
    //setter nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    //setter cargo
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    //setter salario
    public void setSalario(String salario) {
        this.salario = salario;
    }


    public void ImprimeEmpregado() {
        System.out.println("Código do empregado: " + this.codEmpregado);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salário: " + this.salario);
        System.out.println("----------------------");
    }

    public static void TotalEmpregados() {
        System.out.println("Total de empregados contratados: " + contagem);
    }
}
