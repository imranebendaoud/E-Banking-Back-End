package com.ebanking.EBanking.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebanking.EBanking.Exception.NotFoundException;
import com.ebanking.EBanking.Exception.NotFoundException;
import com.ebanking.EBanking.Modele.Compte;
import com.ebanking.EBanking.Repo.CompteRepo;

@Service
public class CompteService {
	private final CompteRepo compteRepo;
	
	@Autowired
	public CompteService(CompteRepo compteRepo) {
		this.compteRepo=compteRepo;
	}
	
	public Compte addCompte(Compte compte) {
		compte.setNumeroCompte(UUID.randomUUID().toString());
		return compteRepo.save(compte);
	}
	public Compte updateCompte(Compte compte) {
		return compteRepo.save(compte);
	}
	
	public List<Compte> findAllComptes(){
		return compteRepo.findAll();
	}
	
	public Compte findCompteBynumeroCompte(String numeroCompte) {
		return compteRepo.findCompteBynumeroCompte(numeroCompte).orElseThrow(() -> new NotFoundException("Compte avec le numero"+numeroCompte+"est introuvable"));
	}
	
	public void deleteCompte(String numeroCompte) {
		compteRepo.deleteCompteBynumeroCompte(numeroCompte) ;
	}
	
	
}
