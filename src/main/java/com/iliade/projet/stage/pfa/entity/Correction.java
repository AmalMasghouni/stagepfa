package com.iliade.projet.stage.pfa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@Table(name = "Correction")
@NoArgsConstructor
public class Correction  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_correction;
    @OneToMany(mappedBy = "correction")
    private List<Question> question;
    @OneToMany(mappedBy = "correction")
    private List<Choix>choix;




    //Getter and Setter

    public Long getId_correction() {
        return id_correction;
    }

    public void setId_correction(Long id_correction) {
        this.id_correction = id_correction;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public List<Choix> getChoix() {
        return choix;
    }

    public void setChoix(List<Choix> choix) {
        this.choix = choix;
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