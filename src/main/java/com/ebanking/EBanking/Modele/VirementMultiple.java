package com.ebanking.EBanking.Modele;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class VirementMultiple extends Virement {
	
	private int nombreBeneficiares;
	
	public VirementMultiple(Long id, Date dateCreation, Date dateExecution, BigDecimal montant, String motif) {
		super(id, dateCreation, dateExecution, montant, motif);
		// TODO Auto-generated constructor stub
	}



	public VirementMultiple(Long id, Date dateCreation, Date dateExecution, BigDecimal montant, String motif,
			int nombreBeneficiares) {
		super(id, dateCreation, dateExecution, montant, motif);
		this.nombreBeneficiares = nombreBeneficiares;
	}


	
}
