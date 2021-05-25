package com.ebanking.EBanking.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebanking.EBanking.Exception.NotFoundException;
import com.ebanking.EBanking.Modele.Admin;

import com.ebanking.EBanking.Repo.AdminRepo;

@Service
public class AdminService {
	public final AdminRepo adminRepo;
	@Autowired
	public AdminService(AdminRepo adminRepo) {
		super();
		this.adminRepo=adminRepo;
	}
	public Admin addAdmint(Admin admin) {
		admin.setId(UUID.randomUUID().getMostSignificantBits());
		return adminRepo.save(admin);
	}
	public Admin updateAdmin(Admin admin) {
		return adminRepo.save(admin);
	}
	
	public List<Admin> findAllAdmins(){
		return adminRepo.findAll();
	}
	
	public Admin findAdminById(Long id) {
		return adminRepo.findAdminByid(id).orElseThrow(() -> new NotFoundException("User by id " + id + " was not found"));
	}
	
	public void deleteAdmin(Long id) {
		adminRepo.deleteAdminByid(id);
	}
	
	public Admin findAdminByNom(String nom) {
		return adminRepo.findAdminBynom(nom).orElseThrow(() -> new NotFoundException("User by name " + nom + " was not found"));
	}
}
