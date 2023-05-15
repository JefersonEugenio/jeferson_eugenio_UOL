package com.cadastroJogador.UOL.codinome;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/codinomes")
public class CodinomeController {

	@Autowired
	private CodinomeRepository repository;
	
	@GetMapping
	public List<Codinome> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	@Transactional
	public void criar(@RequestBody DadosCadastroCodinome dados) {
		repository.save(new Codinome(dados));
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}
