package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Reponse")
public class Reponse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reponse;


    //Getter and Setter

    public Long getId_reponse() {
        return id_reponse;
    }

    public void setId_reponse(Long id_reponse) {
        this.id_reponse = id_reponse;
    }


    //Constructor

    public Reponse(Long id_reponse) {
        this.id_reponse = id_reponse;
    }

    //toString

    @Override
    public String toString() {
        return "Reponse{" +
                "id_reponse=" + id_reponse +
                '}';
    }
}