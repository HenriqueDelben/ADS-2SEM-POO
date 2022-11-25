package atividade3.poo;

public class TesteEmpregado {
    public static void main(String[] args) {
        
        Empregado e1 = new Empregado(1232, "Paulo Silva", "Gerente Financeiro", "R$15.400,00");

        Empregado e2 = new Empregado();
        e2.setCodEmpregado(4567);
        e2.setNome("Ana Paula");
        e2.setCargo("Analista de Sistemas Júnior");
        e2.setSalario("R$10.700,00");

        System.out.println("EMPREGADOS");
        System.out.println("********************");
        e1.ImprimeEmpregado();
        e2.ImprimeEmpregado();
        e2.TotalEmpregados();
    }
}
