package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Test")
public class Test implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_test;
    @Column
    private Test_type type_test;
    @Column
    private Boolean statut_test;
    @Column
    private Float note_test;


    //Getter and Setter

    public Long getId_test() {
        return id_test;
    }

    public void setId_test(Long id_test) {
        this.id_test = id_test;
    }

    public Boolean getStatut_test() {
        return statut_test;
    }

    public void setStatut_test(Boolean statut_test) {
        this.statut_test = statut_test;
    }

    public Float getNote_test() {
        return note_test;
    }

    public void setNote_test(Float note_test) {
        this.note_test = note_test;
    }

    public Test_type getType_test() {
        return type_test;
    }

    public void setType_test(Test_type type_test) {
        this.type_test = type_test;
    }
    //Constructor

    public Test(Long id_test, Test_type type_test, Boolean statut_test, Float note_test) {
        this.id_test = id_test;
        this.type_test = type_test;
        this.statut_test = statut_test;
        this.note_test = note_test;
    }


    //toString


    @Override
    public String toString() {
        return "Test{" +
                "id_test=" + id_test +
                ", type_test=" + type_test +
                ", statut_test=" + statut_test +
                ", note_test=" + note_test +
                '}';
    }
}