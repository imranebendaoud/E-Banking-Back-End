package com.ebanking.EBanking.Modele;

import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Compte {
	private String numeroCompte;
	private String intitule;
	private BigDecimal soldeComptable;
}
