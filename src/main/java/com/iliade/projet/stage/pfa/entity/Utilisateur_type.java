package com.iliade.projet.stage.pfa.entity;

public enum Utilisateur_type {
    admin ("Admin"),
    candidat("Candidat");
    private String name;

    Utilisateur_type(String name) {
        this.name = name;
    }
}
