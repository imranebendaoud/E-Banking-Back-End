package com.ebanking.EBanking.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebanking.EBanking.Exception.NotFoundException;
import com.ebanking.EBanking.Modele.Beneficiare;
import com.ebanking.EBanking.Repo.BeneficiareRepo;

@Service
public class BeneficiareService {
	private final BeneficiareRepo beneficiareRepo;
	
	@Autowired
	public BeneficiareService(BeneficiareRepo beneficiareRepo) {
		this.beneficiareRepo=beneficiareRepo;
	}
	
	public Beneficiare addBeneficiare(Beneficiare beneficiare) {
		beneficiare.setId(UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE);
		return beneficiareRepo.save(beneficiare);
		
	}
	
	public Beneficiare updateBeneficiare(Beneficiare beneficiare) {
		return beneficiareRepo.save(beneficiare);
	}
	
	public List<Beneficiare> findAllBeneficiares(){
		return beneficiareRepo.findAll();
	}
	
	public Beneficiare findBeneficiareById(Long id) {
		return beneficiareRepo.findBeneficiareByid(id).orElseThrow(() -> new NotFoundException("Beneficiare avec le id"+id+"est introuvable"));
	}
	
	public void deleteBeneficiare(Long id) {
		beneficiareRepo.deleteBeneficiareByid(id);
	}
}