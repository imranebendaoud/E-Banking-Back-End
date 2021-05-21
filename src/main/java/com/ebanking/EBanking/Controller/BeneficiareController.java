package com.ebanking.EBanking.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebanking.EBanking.Modele.Beneficiare;
import com.ebanking.EBanking.Service.BeneficiareService;

@RestController
@RequestMapping("/beneficiare")
public class BeneficiareController {
	private final BeneficiareService beneficiareService;
	
	public BeneficiareController(BeneficiareService beneficiareService) {
		this.beneficiareService=beneficiareService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Beneficiare>> getAllBeneficiares(){
		List<Beneficiare> beneficiares = beneficiareService.findAllBeneficiares();
		return new ResponseEntity<List<Beneficiare>>(beneficiares,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Beneficiare> getBeneficiareById(@PathParam("id") Long id){
		Beneficiare beneficiare = beneficiareService.findBeneficiareById(id);
		return new ResponseEntity<>(beneficiare,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Beneficiare> addBeneficiare(@RequestBody Beneficiare beneficiare){
		Beneficiare newBeneficiare = beneficiareService.addBeneficiare(beneficiare);
		return new ResponseEntity<>(newBeneficiare,HttpStatus.CREATED);
	}
	@PostMapping("/update")
	public ResponseEntity<Beneficiare> updateBeneficiare(@RequestBody Beneficiare beneficiare){
		Beneficiare updateBeneficiare = beneficiareService.updateBeneficiare(beneficiare);
		return new ResponseEntity<>(updateBeneficiare,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> updateBeneficiare(@PathParam("id") Long id){
		beneficiareService.deleteBeneficiare(id);;
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
