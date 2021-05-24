package com.ebanking.EBanking.Modele;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="CLIENT")
@Data
@AllArgsConstructor
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "ID_CLIENT")),
    @AttributeOverride(name = "nom", column = @Column(name = "NOM_CLIENT")),
    @AttributeOverride(name = "prenom", column = @Column(name = "PRENOM_CLIENT")),
    @AttributeOverride(name = "cin", column = @Column(name = "CIN_CLIENT")),
    @AttributeOverride(name = "adresse", column = @Column(name = "ADRESSE_CLIENT")),
    @AttributeOverride(name = "telephone", column = @Column(name = "TELEPHONE_CLIENT")),
    @AttributeOverride(name = "email", column = @Column(name = "EMAIL_CLIENT")),
    @AttributeOverride(name = "username", column = @Column(name = "USERNAME_CLIENT")),
    @AttributeOverride(name = "password", column = @Column(name = "PASSWORD_CLIENT")),
    @AttributeOverride(name = "role", column = @Column(name = "ROLE_CLIENT"))
})

public class Client {

}
