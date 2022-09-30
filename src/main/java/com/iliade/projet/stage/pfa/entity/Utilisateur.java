package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@Table(name = "Utilisateur",uniqueConstraints = {
        @UniqueConstraint(columnNames = "login"),
        @UniqueConstraint(columnNames = "email")
}
)
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String login;
    @Column
    private String mot_de_passe;
    @Column
    private String email;
    @Column
    private String phone;
    @Column
    private String pays;
    @Column
    private String Adresse;
    @Column
    private Utilisateur_type type_utilisateur;
    @OneToMany(mappedBy = "utilisateur")
    private List<Candidat> candidat;
  @OneToOne(mappedBy = "utilisateur")
  private Administrateur administrateur;

    public Utilisateur() {
    }


    // Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public Utilisateur_type getType_utilisateur() {
        return type_utilisateur;
    }

    public void setType_utilisateur(Utilisateur_type type_utilisateur) {
        this.type_utilisateur = type_utilisateur;
    }

    public List<Candidat> getCandidat() {
        return candidat;
    }

    public void setCandidat(List<Candidat> candidat) {
        this.candidat = candidat;
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public void setAdministrateur(Administrateur administrateur) {
        this.administrateur = administrateur;
    }
    //Constructor


    public Utilisateur (Long id, String login, String mot_de_passe, String email, String phone, String pays, String adresse, Utilisateur_type type_utilisateur) {
        this.id = id;
        this.login = login;
        this.mot_de_passe = mot_de_passe;
        this.email = email;
        this.phone = phone;
        this.pays = pays;
        Adresse = adresse;
        this.type_utilisateur = type_utilisateur;
    }

    // methode toString

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", mot_de_passe='" + mot_de_passe + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", pays='" + pays + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", type_utilisateur=" + type_utilisateur +
                '}';
    }
}
