package com.iliade.projet.stage.pfa.entity;

public enum Test_type {


    test_competence_technique("test_competence_technique"),
    test_langue("test_langue"),
    test_de_situation_pro("test_de_situation_pro"),
    test_logique("test_logique"),
    test_de_raisonnement("test_de_raisonnement"),
    test_mixte("test_mixte");
    private String name;

    Test_type(String name) {
        this.name = name;
    }

}
