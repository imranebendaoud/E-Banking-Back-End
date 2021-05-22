package com.ebanking.EBanking.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebanking.EBanking.Modele.Compte;

public interface CompteRepo extends JpaRepository<Compte,String> {
	Optional<Compte> findCompteBynumeroCompte(String numeroCompte);

	void deleteCompteBynumeroCompte(String numeroCompte);
}
