package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name = "Reponse")
public class Reponse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reponse;
    @OneToMany(mappedBy = "reponse")
    private List<Question> question;
    @OneToMany(mappedBy = "reponse")
    private List<Choix> choix;


    //Getter and Setter

    public Long getId_reponse() {
        return id_reponse;
    }

    public void setId_reponse(Long id_reponse) {
        this.id_reponse = id_reponse;
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