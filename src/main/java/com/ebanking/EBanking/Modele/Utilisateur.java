package com.ebanking.EBanking.Modele;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@AllArgsConstructor
@NoArgsConstructor
public abstract class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String nom;
	String prenom;
	String cin;
	String adresse;
	String telephone;
	String email;
	@Column(unique=true,nullable=false)
	String username;
	@Column(nullable=false)
	String password;
	@Column(nullable=false)
	String role;
	
}
