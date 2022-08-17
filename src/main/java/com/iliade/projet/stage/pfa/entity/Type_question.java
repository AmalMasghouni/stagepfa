package com.iliade.projet.stage.pfa.entity;

public enum Type_question {
    QCM ("Qcm"),
    QCU("QCU"),
    Implementation("Implementation");
    private String name;

    Type_question(String name) {
        this.name = name;
    }
}
