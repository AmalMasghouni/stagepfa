package com.iliade.projet.stage.pfa.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity

@Table(name = "Exercice")
@NoArgsConstructor
public class Exercice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_exercice;
    @Column
    private String type_exercice;
    @Column
    private Float note_exercice;
    @ManyToOne@JoinColumn(name = "id_test")
    private Test test;
    @OneToMany(mappedBy = "exercice")
    private List<Question> question;




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

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
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