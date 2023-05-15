package com.cadastroJogador.UOL.grupos;

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

import com.cadastroJogador.UOL.jogadores.DadosCadastroJogador;
import com.cadastroJogador.UOL.jogadores.Jogador;

import jakarta.transaction.Transactional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/grupos")
public class GrupoController {

	@Autowired
	private GrupoRepository repository;
	
	@GetMapping
	public List<Grupo> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	@Transactional
	public void criar(@RequestBody DadosCadastroGrupo dados) {
		repository.save(new Grupo(dados));
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable String id) {
		repository.deleteById(id);
	}
	
}
