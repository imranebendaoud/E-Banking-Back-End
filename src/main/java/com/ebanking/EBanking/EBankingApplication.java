package com.ebanking.EBanking;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ebanking.EBanking.Modele.Client;
import com.ebanking.EBanking.Modele.Compte;
import com.ebanking.EBanking.Modele.VirementMultiple;

@SpringBootApplication
public class EBankingApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(EBankingApplication.class, args);
	}

}
