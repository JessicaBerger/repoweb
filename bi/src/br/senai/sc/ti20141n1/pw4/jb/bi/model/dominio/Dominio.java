package br.senai.sc.ti20141n1.pw4.jb.bi.model.dominio;

public class Dominio {

	int idIdeias;
	String titulo;
	String descricao;

	public Dominio() {
	}

	public Dominio(int idIdeias, String titulo, String descricao) {
		super();
		this.idIdeias = idIdeias;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public int getIdIdeias() {
		return idIdeias;
	}

	public void setIdIdeias(int idIdeias) {
		this.idIdeias = idIdeias;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
