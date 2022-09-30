package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Choix;
import com.iliade.projet.stage.pfa.entity.Exercice;
import com.iliade.projet.stage.pfa.repositry.ExerciceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciceServiceImp implements  ExerciceService {
    @Autowired
    ExerciceRepository exerciceRepository;
    @Override
    public Exercice ajouterExercice(Exercice exercice) {
        exerciceRepository.save(exercice);
        return exercice;
    }

    @Override
    public void  deleteExercice(Exercice exercice) {
        exerciceRepository.delete(exercice);
    }

    @Override
    public void deleteExerciceById(Long id) {
        exerciceRepository.deleteById(id);
    }

    @Override
    public Exercice updateExercice(Exercice exercice,Long id) {
        Exercice ex= exerciceRepository.findById(id).get();
        ex.setType_exercice(exercice.getType_exercice());
        ex.setNote_exercice(exercice.getNote_exercice());
        ex.setTest(exercice.getTest());
        ex.setQuestion(exercice.getQuestion());
        return exerciceRepository.save(ex);

    }

    @Override
    public List<Exercice> getAllExercice() {
        return (List<Exercice> )exerciceRepository.findAll() ;
    }
}
