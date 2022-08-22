package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Exercice;

import java.util.List;

public interface ExerciceService {
    Exercice ajouterExercice(Exercice exercice);
    void deleteExercice(Exercice exercice);
    void deleteExerciceById(Long id);
    Exercice updateExercice (Exercice exercice);
    List<Exercice> getAllExercice();
}
