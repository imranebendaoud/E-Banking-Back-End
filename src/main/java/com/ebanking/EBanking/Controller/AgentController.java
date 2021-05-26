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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebanking.EBanking.Modele.Agent;
import com.ebanking.EBanking.Service.AgentService;

@RestController
@RequestMapping("/agent")
public class AgentController {
	private final AgentService AgentService;

	public AgentController(AgentService AgentService) {
		super();
		this.AgentService = AgentService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Agent>> getAllAgents(){
		List<Agent> Agents = AgentService.findAllAgents();
		return new ResponseEntity<>(Agents,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Agent> getAgentById(@PathVariable("id") Long id){
		Agent Agent = AgentService.findAgentById(id);
		return new ResponseEntity<>(Agent,HttpStatus.OK);
	}
	
	@GetMapping("/findby/{nom}")
	public ResponseEntity<Agent> getAgentByNom(@PathVariable("nom") String nom){
		Agent Agent = AgentService.findAgentByNom(nom);
		return new ResponseEntity<>(Agent,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Agent> addAgent(@RequestBody Agent Agent){
		Agent newAgent = AgentService.addAgent(Agent);
		return new ResponseEntity<>(newAgent,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Agent> updateAgent(@RequestBody Agent Agent){
		Agent newAgent = AgentService.updateAgent(Agent);
		return new ResponseEntity<>(newAgent,HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteAgent(@PathVariable("id") Long id){
		AgentService.deleteAgent(id);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
	
}
