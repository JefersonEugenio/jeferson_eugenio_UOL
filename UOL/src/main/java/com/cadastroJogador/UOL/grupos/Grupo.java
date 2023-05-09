package com.cadastroJogador.UOL.grupos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "grupos")
@Entity(name = "Grupo")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private String nomeGrupo;
	
	public Grupo() {
		
	}
	
}
