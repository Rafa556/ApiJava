package com.rafa.socialbooksapi.domain;

import java.util.Date;
import java.util.List;

public class Livro {
	
	private Long id;
	
	private String nome;
	
	private Date publicao;
	
	private String editora;
	
	private String resumo;
	
	private List<Comentario> comentarios;
	
	private String autor;

}
