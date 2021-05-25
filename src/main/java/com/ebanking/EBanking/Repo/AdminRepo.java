package com.ebanking.EBanking.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebanking.EBanking.Modele.Admin;


public interface AdminRepo extends JpaRepository<Admin,Long>{
	void deleteAdminByid(Long id);
	Optional<Admin> findAdminBynom(String nom);
	Optional<Admin> findAdminByid(Long id);
}
