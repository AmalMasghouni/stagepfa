package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Correction")
public class Correction  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_correction;


    //Getter and Setter

    public Long getId_correction() {
        return id_correction;
    }

    public void setId_correction(Long id_correction) {
        this.id_correction = id_correction;
    }


    //Constructor

    public Correction(Long id_correction) {
        this.id_correction = id_correction;
    }


    //toString


    @Override
    public String toString() {
        return "Correction{" +
                "id_correction=" + id_correction +
                '}';
    }
}