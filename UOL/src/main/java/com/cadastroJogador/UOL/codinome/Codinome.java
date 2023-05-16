package com.cadastroJogador.UOL.codinome;

import com.cadastroJogador.UOL.grupos.Grupo;
import com.cadastroJogador.UOL.jogadores.Jogador;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "codinomes")
@Entity(name = "Codinome")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Codinome {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String codinome;
	private String jogador_id;
	private String grupo_id;
	

	public Codinome() {
		
	}
	
	
	public Codinome(DadosCadastroCodinome dados) {
		this.codinome = dados.codinome();
		this.jogador_id = dados.jogador_id();
		this.grupo_id = dados.grupo_id();
	}
	
	@ManyToOne()
	@MapsId("jogadorId")
	@JoinColumn(name="jogador_id")
	private Jogador jogador;
	
	@ManyToOne() 
	@MapsId("grupoId")
	@JoinColumn(name="grupo_id")
	private Grupo grupo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodinome() {
		return codinome;
	}

	public void setCodinome(String codinome) {
		this.codinome = codinome;
	}
	
	public String getJogador_id() {
		return jogador_id;
	}
	
	public void setJogador_id(String jogador_id) {
		this.jogador_id = jogador_id;
	}
	
	public String getGrupo_id() {
		return grupo_id;
	}
	
	public void setGrupo_id(String grupo_id) {
		this.grupo_id = grupo_id;
	}
		
}