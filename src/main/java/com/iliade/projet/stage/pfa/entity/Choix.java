package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Choix")
public class Choix implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_choix;
    @Column
    private String choix;



    //Getter and Setter

    public Long getId_choix() {
        return id_choix;
    }

    public void setId_choix(Long id_choix) {
        this.id_choix = id_choix;
    }

    public String getChoix() {
        return choix;
    }

    public void setChoix(String choix) {
        this.choix = choix;
    }


    //Constructor

    public Choix(Long id_choix, String choix) {
        this.id_choix = id_choix;
        this.choix = choix;
    }


    //toString


    @Override
    public String toString() {
        return "Choix{" +
                "id_choix=" + id_choix +
                ", choix='" + choix + '\'' +
                '}';
    }
}