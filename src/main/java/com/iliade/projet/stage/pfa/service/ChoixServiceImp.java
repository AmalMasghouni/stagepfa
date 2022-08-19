package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Choix;
import com.iliade.projet.stage.pfa.repositry.ChoixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoixServiceImp implements ChoixService {
    @Autowired
    ChoixRepository choixRepository;
    @Override
    public Choix ajouter(Choix choix) {
        choixRepository.save(choix);

        return choix;
    }

    @Override
    public void deleteChoix(Choix choix) {
        choixRepository.delete(choix);
    }

    @Override
    public void deleteChoixById(Long id) {
        choixRepository.deleteById(id);
    }

    @Override
    public Choix updateChoix(Choix choix, Long id) {
        return null;
    }

    @Override
    public List<Choix> getAll() {
        return (List<Choix>) choixRepository.findAll();
    }
}
