package com.iliade.projet.stage.pfa.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "ResultatTest")
public class ResultatTest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_test;
    @Column
    private Long id_condidat;
    @Column
    private Resultat resultat;


    //Getter and Setter

    public Long getId_test() {
        return id_test;
    }

    public void setId_test(Long id_test) {
        this.id_test = id_test;
    }

    public Long getId_condidat() {
        return id_condidat;
    }

    public void setId_condidat(Long id_condidat) {
        this.id_condidat = id_condidat;
    }

    public Resultat getResultat() {
        return resultat;
    }

    public void setResultat(Resultat resultat) {
        this.resultat = resultat;
    }
    //Constructor

    public ResultatTest(Long id_test, Long id_condidat, Resultat resultat) {
        this.id_test = id_test;
        this.id_condidat = id_condidat;
        this.resultat = resultat;
    }





    //toString


    @Override
    public String toString() {
        return "ResultatTest{" +
                "id_test=" + id_test +
                ", id_condidat=" + id_condidat +
                ", resultat=" + resultat +
                '}';
    }
}