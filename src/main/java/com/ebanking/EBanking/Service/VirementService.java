package com.ebanking.EBanking.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebanking.EBanking.Exception.NotFoundException;
import com.ebanking.EBanking.Modele.Virement;
import com.ebanking.EBanking.Repo.VirementRepo;

@Service
public class VirementService {
	private final VirementRepo virementRepo;
	
	@Autowired
	public VirementService(VirementRepo virementRepo) {
		this.virementRepo=virementRepo;
	}
	
	public Virement addVirement(Virement virement) {
		virement.setId(UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE);
		return virementRepo.save(virement);
	}
	
	public List<Virement> findAllVirements(){
		return virementRepo.findAll();
	}
	
	public Virement findVirementById(Long id){
		return virementRepo.findVirementByid(id).orElseThrow(()-> new NotFoundException("Virement avec id "+id+" est introuvable"));
	}
}
