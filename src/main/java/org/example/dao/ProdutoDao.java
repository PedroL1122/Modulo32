package org.example.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.domain.Produto;

import java.util.List;

import static jakarta.persistence.Persistence.createEntityManagerFactory;

public class ProdutoDao implements IProdutoDao{
	@Override
	public Produto cadastrar(Produto produto) {
		EntityManagerFactory entityManagerFactory = createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
				entityManager.getTransaction().begin();
				entityManager.persist(produto);
				entityManager.getTransaction().commit();
				
				entityManager.close();
				entityManagerFactory.close();
				
				return produto;
	}

	@Override
	public void excluir(Produto produto) {

	}

	@Override
	public List<Produto> buscarTodos() {
		return null;
	}
}
