package org.example;
import static org.junit.Assert.assertNotNull;

import org.example.dao.IProdutoDao;
import org.example.dao.ProdutoDao;
import org.example.domain.*;
import org.junit.Test;

public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setId(2);
		produto.setNome("nobreak");
		produto.setPreco(600);
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
		
		
}
}
