package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Poste")
public class Poste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_poste;
    @Column
    private String nom_du_poste;


    //Getter and Setter

    public Long getId_poste() {
        return id_poste;
    }

    public void setId_poste(Long id_poste) {
        this.id_poste = id_poste;
    }

    public String getNom_du_poste() {
        return nom_du_poste;
    }

    public void setNom_du_poste(String nom_du_poste) {
        this.nom_du_poste = nom_du_poste;
    }



    //Constructor

    public Poste(Long id_poste, String nom_du_poste) {
        this.id_poste = id_poste;
        this.nom_du_poste = nom_du_poste;
    }


    //toString

    @Override
    public String toString() {
        return "Poste{" +
                "id_poste=" + id_poste +
                ", nom_du_poste='" + nom_du_poste + '\'' +
                '}';
    }
}