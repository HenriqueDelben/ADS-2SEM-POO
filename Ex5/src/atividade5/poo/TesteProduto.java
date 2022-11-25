package atividade5.poo;

import java.util.Scanner;

public class TesteProduto {
	
    public static void main(String[] args) {
        Produto p1 = new Produto("1232", "Celular Samsung S8", 30);

        Produto p2 = new Produto();

        p2.setCodProduto("3456");
        p2.setDescProduto("Monitor Samsung SyncMaster");
        p2.setQuantidadeProduto(12);

        p1.RetiraEstoque(5);
        p2.RetiraEstoque(8);

        System.out.println("INFORMACOES DO PRODUTOS");
        System.out.println("Produto 1");
        p1.ImprimeProduto();
        p1.StatusEstoque();
        System.out.println();
        System.out.println("Produto 2");
        p2.ImprimeProduto();
        p2.StatusEstoque();

        p1.RetiraEstoque(10);
        p2.RetiraEstoque(12);

        System.out.println("---------------------");

        System.out.println("Produto 1");
        p1.ImprimeProduto();
        p1.StatusEstoque();
        System.out.println();
        System.out.println("Produto 2");
        p2.ImprimeProduto();
        p2.StatusEstoque();
        
        System.out.println("-----------------------");

        Produto.AlteraLimite(15);
        p1.StatusEstoque();
        p2.StatusEstoque();
        
        System.out.println("-----------------------");

        Produto.AlteraLimite(EntradaValorLimite());
        p1.StatusEstoque();
        p2.StatusEstoque();
    }

    public static int EntradaValorLimite() {
    	
        System.out.println("Digite o novo valor limite para o estoque: ");
        System.out.println();
        Scanner input = new Scanner(System.in);
        int novoLimite = input.nextInt();

        input.close();
        
        if (novoLimite <= 0)
        	return -1;
        
        return novoLimite;
    }
}
