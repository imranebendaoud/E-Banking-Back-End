package com.ebanking.EBanking.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebanking.EBanking.Modele.Agent;

public interface AgentRepo extends JpaRepository<Agent, Long> {
	void deleteAgentByid(Long id);
	Optional<Agent> findAgentBynom(String nom);
	Optional<Agent> findAgentByid(Long id);
}
