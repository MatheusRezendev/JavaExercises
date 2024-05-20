package br.edu.univas.gerenciadorbiblioteca;

import java.util.List;

public class Usuario {
	private String Nome;
	private int idUsuario;
	public List <Livro> livrosEmprestados;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public List<Livro> getLivrosEmprestados() {
		return livrosEmprestados;
	}
	public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}
	

}
