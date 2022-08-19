package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Exercice;

import java.util.List;

public interface ExerciceService {
    Exercice ajouter(Exercice exercice);
    void deleteExercice(Exercice exercice);
    void deleteExerciceById(Long id);
    Exercice updateExercice (Exercice exercice, Long id);
    List<Exercice> getAllExercice();
}
