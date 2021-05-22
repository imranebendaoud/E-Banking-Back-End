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

import com.ebanking.EBanking.Modele.Compte;
import com.ebanking.EBanking.Service.CompteService;

@RestController
@RequestMapping("/compte")
public class CompteController {
	private final CompteService compteService;
	
	public CompteController(CompteService compteService) {
		this.compteService=compteService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Compte>> getAllComptes(){
		List<Compte> comptes = compteService.findAllComptes();
		return new ResponseEntity<List<Compte>>(comptes,HttpStatus.OK);
	}
	@GetMapping("/find/{numeroCompte}")
	public ResponseEntity<Compte> getCompteBynumeroCompte(@PathVariable("numeroCompte") String numeroCompte){
		Compte compte = compteService.findCompteBynumeroCompte(numeroCompte);
		return new ResponseEntity<>(compte,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Compte> addCompte(@RequestBody Compte compte){
		Compte newCompte = compteService.addCompte(compte);
		return new ResponseEntity<>(newCompte,HttpStatus.CREATED );
	}
	
	@PutMapping("/update")
	public ResponseEntity<Compte> updateCompte(@RequestBody Compte compte){
		Compte updateCompte = compteService.updateCompte(compte);
		return new ResponseEntity<>(updateCompte,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{numeroCompte}")
	public ResponseEntity<?> updateCompte(@PathVariable("numeroCompte") String numeroCompte){
		compteService.deleteCompte(numeroCompte);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
