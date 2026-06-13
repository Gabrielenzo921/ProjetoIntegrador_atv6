package main;

import model.Produto;
import service.ProdutoService;

public class Principal {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();

        System.out.println("===== INICIANDO TESTES DE REFACTORING (ETAPA 6) =====");

        // TESTE 1: Tentando cadastrar um produto inválido (Sem nome)
        System.out.println("\nExecutando Teste 1: Produto sem nome...");
        try {
            Produto p1 = new Produto("", 25.50, 10);
            produtoService.cadastrarProduto(p1);
        } catch (Exception e) {
            System.out.println("Resultado do Teste 1: " + e.getMessage()); // Deve exibir o erro controlado
        }

        // TESTE 2: Tentando cadastrar um produto inválido (Preço negativo)
        System.out.println("\nExecutando Teste 2: Produto com preço inválido...");
        try {
            Produto p2 = new Produto("Teclado Mecânico", -15.00, 5);
            produtoService.cadastrarProduto(p2);
        } catch (Exception e) {
            System.out.println("Resultado do Teste 2: " + e.getMessage()); // Deve exibir o erro controlado
        }

        // TESTE 3: Cadastrando um produto 100% correto
        System.out.println("\nExecutando Teste 3: Produto válido...");
        try {
            Produto p3 = new Produto("Mouse Gamer", 120.00, 15);
            produtoService.cadastrarProduto(p3); // Deve exibir mensagem de sucesso
            System.out.println("Resultado do Teste 3: Operação concluída perfeitamente.");
        } catch (Exception e) {
            System.out.println("Resultado do Teste 3 (Erro inesperado): " + e.getMessage());
        }

        System.out.println("\n===== FIM DOS TESTES =====");
    }
}