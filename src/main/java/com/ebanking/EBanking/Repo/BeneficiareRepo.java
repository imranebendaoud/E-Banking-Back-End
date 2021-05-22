package com.ebanking.EBanking.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebanking.EBanking.Modele.Beneficiare;

public interface BeneficiareRepo extends JpaRepository<Beneficiare,Long> {

	Optional <Beneficiare> findBeneficiareByid(Long id);

	void deleteBeneficiareByid(Long id);

}
