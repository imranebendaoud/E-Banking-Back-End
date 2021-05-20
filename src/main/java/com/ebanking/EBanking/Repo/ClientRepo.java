package com.ebanking.EBanking.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebanking.EBanking.Modele.Client;

public interface ClientRepo extends JpaRepository<Client, Long> {
	void deleteClientByclientId(Long id);
	Optional<Client> findClientByclientId(Long id);
}
