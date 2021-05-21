package com.ebanking.EBanking.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebanking.EBanking.Modele.Virement;

public interface VirementRepo extends JpaRepository<Virement, Long> {

	Optional <Virement> findVirementByid(Long id);

}
