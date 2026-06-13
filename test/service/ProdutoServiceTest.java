package service;

import model.Produto;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoServiceTest {

    @Test
    public void testAplicarDescontoValido() {
        Produto p = new Produto("Monitor", 100.0, 5);
        ProdutoService service = new ProdutoService();
        double precoComDesconto = service.aplicarDesconto(p, 15.0);
        Assert.assertEquals(85.0, precoComDesconto, 0.01);
    }
    
    @Test
    public void testAplicarDescontoInvalido() {
        Produto p = new Produto("Teclado", 50.0, 10);
        ProdutoService service = new ProdutoService();
        try {
            service.aplicarDesconto(p, 150.0);
            Assert.fail("O teste deveria ter falhado, pois o desconto é inválido.");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Desconto inválido", e.getMessage());
        }
    }
}