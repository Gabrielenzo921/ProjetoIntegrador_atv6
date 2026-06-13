package service;

import model.Produto;

public class ProdutoService {

    // Método responsável estritamente por validar e salvar o produto
    public void cadastrarProduto(Produto produto) throws Exception {
        
        // Regra de Negócio 1: Nome não pode ser vazio
        if (produto.getNome() == null || produto.getNome().trim().isEmpty()) {
            throw new Exception("Validação Falhou: O nome do produto é obrigatório.");
        }
        
        // Regra de Negócio 2: Preço deve ser maior que zero
        if (produto.getPreco() <= 0) {
            throw new Exception("Validação Falhou: O preço do produto deve ser maior que zero.");
        }
        
        // Regra de Negócio 3: Estoque não pode ser negativo
        if (produto.getQuantidadeEstoque() < 0) {
            throw new Exception("Validação Falhou: A quantidade em estoque não pode ser negativa.");
        }

        // Se passar por todas as regras, o sistema simula o salvamento
        System.out.println("Sucesso: Produto '" + produto.getNome() + "' validado e salvo com sucesso!");
    }
}