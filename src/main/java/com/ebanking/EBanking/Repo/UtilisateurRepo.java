package com.ebanking.EBanking.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebanking.EBanking.Modele.Utilisateur;

public interface UtilisateurRepo extends JpaRepository<Utilisateur, Long> {
	
	Optional<Utilisateur> findByUsername(String username);



}
