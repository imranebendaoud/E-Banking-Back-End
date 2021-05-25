package com.ebanking.EBanking.Modele;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class VirementMultipleBeneficiare {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private BigDecimal montant;

}
