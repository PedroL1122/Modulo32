package org.example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "produto_seq")
@SequenceGenerator(name="produto_seq", sequenceName= "sq_produto", initialValue = 1, allocationSize = 1)
private int id;

@Column(name="NAME", length= 100, nullable = false)
private String nome;
@Column(name="PRECO", length= 50, nullable = false)
private int preco;


public int getId() {
	return id;
}
public void setID(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getPreco() {
	return preco;
}
public void setPreco(int preco) {
	this.preco = preco;
}






}
