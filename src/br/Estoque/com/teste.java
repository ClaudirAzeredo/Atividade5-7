package br.Estoque.com;

public class teste {
    public static void main(String[] args) {
        // Criando um objeto Produto
        Produto produto1 = new Produto(1, "Produto A", 10.0, 50);

        // Imprimindo os detalhes do produto
        System.out.println("Detalhes do Produto:");
        System.out.println("Código: " + produto1.getCodigo());
        System.out.println("Descrição: " + produto1.getDescricao());
        System.out.println("Preço: " + produto1.getPreco());
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());

        // Adicionando estoque
        produto1.adicionarEstoque(20);
        System.out.println("\nApós adicionar estoque:");
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());

        // Removendo estoque
        produto1.removerEstoque(15);
        System.out.println("\nApós remover estoque:");
        System.out.println("Quantidade em Estoque: " + produto1.getQuantidadeEmEstoque());

        // Tentando remover mais estoque do que o disponível
        produto1.removerEstoque(40);
    }
}

