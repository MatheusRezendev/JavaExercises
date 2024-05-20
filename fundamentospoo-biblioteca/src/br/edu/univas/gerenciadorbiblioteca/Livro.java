package br.edu.univas.gerenciadorbiblioteca;

public class Livro {
	private String Titulo;
	private String Autor;
	private String Categoria;
	private int qtdDisponivel;
	
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getCategoria() {
		return Categoria;
	}
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	public int getQtdDisponivel() {
		return qtdDisponivel;
	}
}
