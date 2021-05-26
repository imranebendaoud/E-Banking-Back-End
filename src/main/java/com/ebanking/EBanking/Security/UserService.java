package com.ebanking.EBanking.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;


import com.ebanking.EBanking.Security.User;
import com.ebanking.EBanking.Exception.NotFoundException;
import com.ebanking.EBanking.Modele.Utilisateur;
import com.ebanking.EBanking.Repo.UtilisateurRepo;
@Configuration
public class UserService implements UserDetailsService{
	@Autowired
	UtilisateurRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws NotFoundException {
		// TODO Auto-generated method stub
		Utilisateur utilisateur=repo.findByUsername(username).get();
		User user= new User(utilisateur);
		return user;
	}

}
