package atividade6.poo;

public class Pessoa {

    private String nome;
    private String endereço;
    private String cpf;
    private String rg;

    public Pessoa(String nome, String endereço, String cpf, String rg) {

        super();
        this.nome = nome;
        this.endereço = endereço;
        this.cpf = cpf;
        this.rg = rg;
    }

    // Construtor Default
    public Pessoa() {

    }

    // Construtor Clone
    public Pessoa(Pessoa pessoa) {

        this.nome = pessoa.nome;
        this.endereço = pessoa.endereço;
        this.cpf = pessoa.cpf;
        this.rg = pessoa.rg;
    }

    // Getter nome
    public String getNome() {
        return this.nome;
    }

    // Getter Endereço
    public String getEndereço() {
        return this.endereço;
    }
    // Getter CPF
    public String getCpf() {
        return this.cpf;
    }
    // Geter RG
    public String getRg() {
        return this.rg;
    }

    // Setter Nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter Endereço
    public void setEndereço(String endereço) {
        this.nome = endereço;
    }

    // Setter CPF
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    // Setter RG
    public void setRg(String rg) {
        this.cpf = rg;
    }

    public void ImprimePessoa() {

        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereço);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
    }
}
