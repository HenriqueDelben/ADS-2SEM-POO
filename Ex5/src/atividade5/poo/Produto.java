package atividade5.poo;

public class Produto {
    private String codProduto;
    private String descProduto;
    private int quantidadeProduto;
    private static int quantidadeTotalProdutos;
    private static int limiteEstoque = 10;

    // Construtor com pârametros
    public Produto(String codProduto, String descProduto, int quantidadeProduto) {
        this.codProduto = codProduto;
        this.descProduto = descProduto;
        this.quantidadeProduto = quantidadeProduto;

        quantidadeTotalProdutos++;
    }

    // Contrutor default
    public Produto() {
        quantidadeTotalProdutos++;
    }
    
    // Setter codProduto
    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    // Setter descProduto
    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    // Setter quantidadeProduto
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    // Setter QuantidadeTotalProdutos
    public static void setQuantidadeTotalProdutos(int quantidadeTotalProduto) {
        Produto.quantidadeTotalProdutos = quantidadeTotalProduto;
    }

    // Setter limiteEstoque
    public static void setlimiteEstoque(int limiteEstoque) {
        Produto.limiteEstoque = limiteEstoque;
    }

    // Getter codProduto
    public String getCodProduto() {
        return codProduto;
    }

    // Getter descProduto
    public String getDescProduto() {
        return descProduto;
    }

    // Getter codProduto
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    // Getter QuantidadeTotalProdutos
    public static int QuantidadeTotalProdutos() {
        return quantidadeTotalProdutos;
    }

    // Getter limiteEstoque
    public static int getLimiteEstoque() {
        return limiteEstoque;
    }

    // Retira uma quantidade de estoque do produto
    public void RetiraEstoque(int quantidadeRetirada) {

        if (quantidadeProduto > 0) {
            this.quantidadeProduto -= quantidadeRetirada;
        }
        else {
            System.out.println("Não é possível retirar produtos. O estoque já está vazio");
            this.quantidadeProduto = 0;
        }
    }

    // Adiciona ao estoque uma quantidade do produto 
    public void AdicionaEstoque(int quantidadeAdicionada) {
        this.quantidadeProduto += quantidadeAdicionada;
    }

    // Imprime as informações do produto
    public void ImprimeProduto() {
        System.out.println("Codigo do produto: " + this.codProduto);
        System.out.println("Descricao do produto: " + this.descProduto);
        System.out.println("Quantidade do produto: " + this.quantidadeProduto);
    }

    // Imprime o total de produtos criados
    public static void ImprimeTotalProdutos() {
        System.out.println("Total de produtos criados: " + Produto.quantidadeTotalProdutos);
    }

    // Imprime o status do estoque do produto
    public void StatusEstoque() {

        System.out.println("Produto: " + this.descProduto);
        
        if (this.quantidadeProduto > Produto.limiteEstoque)
            System.out.println("Estoque Regular");
        else if (this.quantidadeProduto > 0 && this.quantidadeProduto <= Produto.limiteEstoque)
            System.out.println("Estoque Restrito");
        else    
            System.out.println("Estoque Nulo");
    }

    // Define um novo limite para o estoque de todos os produtos
    public static void AlteraLimite(int limite) {
    	
        if (limite <= 0)
        	System.out.println("Valor de novo limite inválido");
        
        else
        	Produto.limiteEstoque = limite;
    }
}