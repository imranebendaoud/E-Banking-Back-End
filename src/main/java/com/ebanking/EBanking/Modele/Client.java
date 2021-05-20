package com.ebanking.EBanking.Modele;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long clientId;
	String nom, email, mdp, phone;
	java.util.Date created;
	public Long getClientId() {
		return clientId;
	}
	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public java.util.Date getCreated() {
		return created;
	}
	public void setCreated(java.util.Date created) {
		this.created = created;
	}
	public Client(Long clientId, String nom, String email, String mdp, String phone, Date created) {
		super();
		this.clientId = clientId;
		this.nom = nom;
		this.email = email;
		this.mdp = mdp;
		this.phone = phone;
		this.created = created;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", nom=" + nom + ", email=" + email + ", mdp=" + mdp + ", phone="
				+ phone + ", created=" + created + "]";
	}
	
	
	
}
