package com.cadastroJogador.UOL.jogadores;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "jogadores")
@Entity(name = "Jogador")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String nome;
	private String email;
	private String telefone;
	
	public Jogador() {
		
	}

	public Jogador(DadosCadastroJogador dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.telefone = dados.telefone();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	
}
