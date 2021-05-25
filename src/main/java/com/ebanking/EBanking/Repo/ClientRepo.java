package com.ebanking.EBanking.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebanking.EBanking.Modele.Client;

public interface ClientRepo extends JpaRepository<Client, Long> {
	void deleteClientByid(Long id);
	Optional<Client> findClientBynom(String nom);
	Optional<Client> findClientByid(Long id);
}
