package com.ebanking.EBanking.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebanking.EBanking.Modele.Client;
import com.ebanking.EBanking.Service.ClientService;


@RestController
@RequestMapping("/client")
public class ClientController {
	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Client>> getAllClients(){
		List<Client> clients = clientService.findAllClients();
		return new ResponseEntity<>(clients,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable("id") Long id){
		Client client = clientService.findClientById(id);
		return new ResponseEntity<>(client,HttpStatus.OK);
	}
	
	@GetMapping("/findby/{nom}")
	public ResponseEntity<Client> getClientByNom(@PathVariable("nom") String nom){
		Client client = clientService.findClientByNom(nom);
		return new ResponseEntity<>(client,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Client> addClient(@RequestBody Client client){
		Client newClient = clientService.addClient(client);
		return new ResponseEntity<>(newClient,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Client> updateClient(@RequestBody Client client){
		Client newClient = clientService.updateClient(client);
		return new ResponseEntity<>(newClient,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteClient(@PathVariable("id") Long id){
		clientService.deleteClient(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
}
