package com.ebanking.EBanking.Modele;

import javax.persistence.*;

import lombok.*;

@Entity
@Data 
@Table(name="AGENT")
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "ID_AGENT")),
    @AttributeOverride(name = "nom", column = @Column(name = "NOM_AGENT")),
    @AttributeOverride(name = "prenom", column = @Column(name = "PRENOM_AGENT")),
    @AttributeOverride(name = "cin", column = @Column(name = "CIN_AGENT")),
    @AttributeOverride(name = "adresse", column = @Column(name = "ADRESSE_AGENT")),
    @AttributeOverride(name = "telephone", column = @Column(name = "TELEPHONE_AGENT")),
    @AttributeOverride(name = "email", column = @Column(name = "EMAIL_AGENT")),
    @AttributeOverride(name = "username", column = @Column(name = "USERNAME_AGENT")),
    @AttributeOverride(name = "password", column = @Column(name = "PASSWORD_AGENT")),
    @AttributeOverride(name = "role", column = @Column(name = "ROLE_AGENT"))
})
public class Agent extends Utilisateur{
	
	/*@ManyToOne // bzaf tles agents 3ndhom admin
	@JoinColumn(name="CREATION_ADMIN_AGENT")
	Admin creationAdmin;*/

}
