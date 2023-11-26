package org.example.dao;

import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;
import org.example.domain.*;

import java.util.List;

public interface IProdutoDao {

	public Produto cadastrar(Produto produto);

	public void excluir(Produto produto);

	public List<Produto> buscarTodos();
}