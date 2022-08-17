package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@Table(name = "Candidat")

public class Candidat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidat;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String nationnalite;
    @Column
    private String ecole;
    @Column
    private String diplome;
    @Column
    private String specialite;
    @Column
    private String niveau;


    //Getter and Setter

    public Long getId_candidat() {
        return id_candidat;
    }

    public void setId_candidat(Long id_candidat) {
        this.id_candidat = id_candidat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNationnalite() {
        return nationnalite;
    }

    public void setNationnalite(String nationnalite) {
        this.nationnalite = nationnalite;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }


    //Constructor

    public Candidat(Long id_candidat, String nom, String prenom, String nationnalite, String ecole, String diplome, String specialite, String niveau) {
        this.id_candidat = id_candidat;
        this.nom = nom;
        this.prenom = prenom;
        this.nationnalite = nationnalite;
        this.ecole = ecole;
        this.diplome = diplome;
        this.specialite = specialite;
        this.niveau = niveau;
    }


    //toString


    @Override
    public String toString() {
        return "Candidat{" +
                "id_candidat=" + id_candidat +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nationnalite='" + nationnalite + '\'' +
                ", ecole='" + ecole + '\'' +
                ", diplome='" + diplome + '\'' +
                ", specialite='" + specialite + '\'' +
                ", niveau='" + niveau + '\'' +
                '}';
    }
}