package com.ebanking.EBanking.Modele;

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
public class Client {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long clientId;
	String nom, email, mdp, phone;
	Date created;
}
