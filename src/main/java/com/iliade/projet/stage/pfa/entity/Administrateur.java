package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@Table(name = "Administrateur")
public class Administrateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_admin;
  @Column
    private String nom_commercial;
    @Column
    private String nom_responsable;


    //Getter and Setter

    public Long getId_admin() {
        return id_admin;
    }

    public void setId_admin(Long id_admin) {
        this.id_admin = id_admin;
    }

    public String getNom_commercial() {
        return nom_commercial;
    }

    public void setNom_commercial(String nom_commercial) {
        this.nom_commercial = nom_commercial;
    }

    public String getNom_responsable() {
        return nom_responsable;
    }

    public void setNom_responsable(String nom_responsable) {
        this.nom_responsable = nom_responsable;
    }



    // Constructor

    public Administrateur(Long id_admin, String nom_commercial, String nom_responsable) {
        this.id_admin = id_admin;
        this.nom_commercial = nom_commercial;
        this.nom_responsable = nom_responsable;
    }


    //toString


    @Override
    public String toString() {
        return "Administrateur{" +
                "id_admin=" + id_admin +
                ", nom_commercial='" + nom_commercial + '\'' +
                ", nom_responsable='" + nom_responsable + '\'' +
                '}';
    }
}
