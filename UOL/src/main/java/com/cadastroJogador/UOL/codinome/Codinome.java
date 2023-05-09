package com.cadastroJogador.UOL.codinome;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	public Codinome() {
		
	}
}