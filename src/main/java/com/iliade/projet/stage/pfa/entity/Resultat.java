package com.iliade.projet.stage.pfa.entity;

public enum Resultat {
    admis("admis"),
    non_admis("non admis");
    private String name;

    Resultat(String name) {
        this.name = name;
    }
}
