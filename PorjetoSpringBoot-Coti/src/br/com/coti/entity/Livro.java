package br.com.coti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="livro")
public class Livro implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(name="")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@Column( length = 50)
	private String nomeLivro;
	@Column( length = 255)
	private String Imagem;
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	public Livro(Long id, String nomeLivro, String imagem) {
		super();
		this.id = id;
		this.nomeLivro = nomeLivro;
		Imagem = imagem;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getImagem() {
		return Imagem;
	}
	public void setImagem(String imagem) {
		Imagem = imagem;
	}
	
	
	
}
