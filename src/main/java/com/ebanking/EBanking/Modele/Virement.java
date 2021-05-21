package com.ebanking.EBanking.Modele;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Virement {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private Date dateCreation ;
	private Date dateExecution ;
	private BigDecimal montant;
	private String motif;
}
