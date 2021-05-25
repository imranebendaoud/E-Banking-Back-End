package com.ebanking.EBanking.Modele;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Virement {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private Date dateCreation ;
	private Date dateExecution ;
	private BigDecimal montant;
	private String motif;
}
