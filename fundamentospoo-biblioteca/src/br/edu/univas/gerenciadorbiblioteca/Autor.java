package br.edu.univas.gerenciadorbiblioteca;

import java.util.List;

public class Autor {
	private String Nome;
	public List <Livro> livrosAutor;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public List<Livro> getLivrosAutor() {
		return livrosAutor;
	}
	public void setLivrosAutor(List<Livro> livrosAutor) {
		this.livrosAutor = livrosAutor;
	} 
		
}
