package com.cadastroJogador.UOL.jogadores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/jogadores")
public class JogadorController {

	@Autowired
	private JogadorRepository repository;
	
	@GetMapping
	public List<Jogador> listar() {
		return repository.findAll();
	}
	
}
