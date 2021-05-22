package com.ebanking.EBanking.Controller;

import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ebanking.EBanking.Modele.Virement;
import com.ebanking.EBanking.Service.VirementService;

@RestController
@RequestMapping("/virement")
public class VirementController {
private final VirementService virementService;
	
	
	public VirementController(VirementService virementService) {
		this.virementService=virementService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Virement>> getAllVirements(){
		List<Virement> virements = virementService.findAllVirements();
		return new ResponseEntity<List<Virement>>(virements,HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Virement> getVirementById(@PathParam("id") Long id){
		Virement virement = virementService.findVirementById(id);
		return new ResponseEntity<Virement>(virement,HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Virement> addVirementById(@RequestBody Virement virement){
		Virement newVirement = virementService.addVirement(virement);
		return new ResponseEntity<Virement>(newVirement,HttpStatus.OK);
	}
}
