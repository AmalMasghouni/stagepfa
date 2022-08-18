package com.iliade.projet.stage.pfa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Question")
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_question;
    @Column
    private Type_question type_question;

    @Column
    private String question;
    @Column
    private Float note_question;
    @ManyToOne@JoinColumn(name = "id_exercice")
    private Exercice exercice;
    @ManyToOne@JoinColumn(name ="id_correction")
    private Correction correction;
    @ManyToOne@JoinColumn(name = "id_reponse")
    private Reponse reponse;



    // Getters and setters

    public Long getId_question() {
        return id_question;
    }

    public void setId_question(Long id_question) {
        this.id_question = id_question;
    }

    public Type_question getType_question() {
        return type_question;
    }

    public void setType_question(Type_question type_question) {
        this.type_question = type_question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Float getNote_question() {
        return note_question;
    }

    public void setNote_question(Float note_question) {
        this.note_question = note_question;
    }

    public Exercice getExercice() {
        return exercice;
    }

    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }

    public Correction getCorrection() {
        return correction;
    }

    public void setCorrection(Correction correction) {
        this.correction = correction;
    }

    public Reponse getReponse() {
        return reponse;
    }

    public void setReponse(Reponse reponse) {
        this.reponse = reponse;
    }
//Constructor

    public Question(Long id_question, Type_question type_question, String question, Float note_question) {
        this.id_question = id_question;
        this.type_question = type_question;
        this.question = question;
        this.note_question = note_question;
    }


    //toString


    @Override
    public String toString() {
        return "Question{" +
                "id_question=" + id_question +
                ", type_question=" + type_question +
                ", question='" + question + '\'' +
                ", note_question=" + note_question +
                '}';
    }
}
