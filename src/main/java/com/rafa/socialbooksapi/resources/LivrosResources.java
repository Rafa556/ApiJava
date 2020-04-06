package com.rafa.socialbooksapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafa.socialbooks.repository.LivrosRepository;
import com.rafa.socialbooksapi.domain.Livro;

@RestController
@RequestMapping("/livros")
public class LivrosResources {
	
	@Autowired
	private LivrosRepository livrosRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Livro> listar() {
		return livrosRepository.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void Salvar(@RequestBody Livro livro) {
		livrosRepository.save(livro);
		
	}
	
	public Livro buscar(Long id) {
		return livrosRepository.findOne(id);
		
	}
}
