package com.cadastroJogador.UOL.jogadores;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, String>{
	Optional<Jogador> findById(String id);
	List<Jogador> findByNomeLike(String likePattern);
}
