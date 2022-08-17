package com.iliade.projet.stage.pfa.entity;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Exercice")
public class Exercice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exercice;
    @Column
    private String type_exercice;
    @Column
    private Float note_exercice;




    //Getters and Setters

    public Long getId_exercice() {
        return id_exercice;
    }

    public void setId_exercice(Long id_exercice) {
        this.id_exercice = id_exercice;
    }

    public String getType_exercice() {
        return type_exercice;
    }

    public void setType_exercice(String type_exercice) {
        this.type_exercice = type_exercice;
    }

    public Float getNote_exercice() {
        return note_exercice;
    }

    public void setNote_exercice(Float note_exercice) {
        this.note_exercice = note_exercice;
    }


    // Constructor

    public Exercice(Long id_exercice, String type_exercice, Float note_exercice) {
        this.id_exercice = id_exercice;
        this.type_exercice = type_exercice;
        this.note_exercice = note_exercice;
    }


    // toString


    @Override
    public String toString() {
        return "Exercice{" +
                "id_exercice=" + id_exercice +
                ", type_exercice='" + type_exercice + '\'' +
                ", note_exercice=" + note_exercice +
                '}';
    }
}