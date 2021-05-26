package com.ebanking.EBanking.Security;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.ebanking.EBanking.Security.UserService;
import com.ebanking.EBanking.Modele.Admin;
import com.ebanking.EBanking.Exception.NotFoundException;
import com.ebanking.EBanking.Service.AdminService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
		
		@Autowired
		AdminService adminService;
		@Autowired
		UserService service;
		
		@Autowired
		public SecurityConfig(UserService service) {

			this.service = service;
		}
		
		@PostConstruct
		public void init() {
			List<Admin>  currentAdminList= new ArrayList<Admin>();
			try {
			currentAdminList = adminService.findAllAdmins();
			} catch (NotFoundException e) {
				Admin    admin    = new Admin();
		        admin.setUsername("admin");
		        admin.setPassword("admin");
		        admin.setEmail("-------------------------");					//email a creer
		        admin.setRole("Admin");
		        adminService.addAdmin(admin);	
			}

		    
		}

		@Bean
		public DaoAuthenticationProvider autProvider()
		{
			DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
			provider.setUserDetailsService(service);
			provider.setPasswordEncoder(new BCryptPasswordEncoder());
			
			return provider;
		}
		
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			//need controllers for mapping
		}
		
}
