package com.ebanking.EBanking.Service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebanking.EBanking.Exception.UserNotFoundException;
import com.ebanking.EBanking.Modele.Client;
import com.ebanking.EBanking.Repo.ClientRepo;
@Service
@Transactional
public class ClientService {
	private final ClientRepo clientRepo;
	@Autowired
	public ClientService(ClientRepo clientRepo) {
		super();
		this.clientRepo = clientRepo;
	}
	
	public Client addClient(Client client) {
		client.setClientId(UUID.randomUUID().getMostSignificantBits());
		return clientRepo.save(client);
	}
	public Client updateClient(Client client) {
		return clientRepo.save(client);
	}
	
	public List<Client> findAllClients(){
		return clientRepo.findAll();
	}
	
	public Client findClientById(Long id) {
		return clientRepo.findClientByclientId(id).orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
	}
	
	public void deleteClient(Long id) {
		clientRepo.deleteClientByclientId(id);
	}
	
	
}
