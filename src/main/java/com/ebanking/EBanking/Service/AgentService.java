package com.ebanking.EBanking.Service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebanking.EBanking.Exception.NotFoundException;
import com.ebanking.EBanking.Modele.Agent;
import com.ebanking.EBanking.Repo.AgentRepo;
@Service
@Transactional
public class AgentService {
	private final AgentRepo AgentRepo;
	@Autowired
	public AgentService(AgentRepo AgentRepo) {
		super();
		this.AgentRepo = AgentRepo;
	}
	
	public Agent addAgent(Agent Agent) {
		Agent.setId(UUID.randomUUID().getMostSignificantBits());
		return AgentRepo.save(Agent);
	}
	public Agent updateAgent(Agent Agent) {
		return AgentRepo.save(Agent);
	}
	
	public List<Agent> findAllAgents(){
		return AgentRepo.findAll();
	}
	
	public Agent findAgentById(Long id) {
		return AgentRepo.findAgentByid(id).orElseThrow(() -> new NotFoundException("User by id " + id + " was not found"));
	}
	
	public void deleteAgent(Long id) {
		AgentRepo.deleteAgentByid(id);
	}
	
	public Agent findAgentByNom(String nom) {
		return AgentRepo.findAgentBynom(nom).orElseThrow(() -> new NotFoundException("User by name " + nom + " was not found"));
	}
}
