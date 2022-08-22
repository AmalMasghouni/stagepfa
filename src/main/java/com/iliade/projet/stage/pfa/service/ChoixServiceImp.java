package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Choix;
import com.iliade.projet.stage.pfa.repositry.ChoixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class ChoixServiceImp implements ChoixService {
    @Autowired
    ChoixRepository choixRepository;
    @Override
    public Choix ajouterChoix(Choix choix) {
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
    public Choix updateChoix(Choix choix , Long id) {

       Choix cho= choixRepository.findById(id).get();
       cho.setChoix(choix.getChoix());
       cho.setCorrection(choix.getCorrection());
       cho.setReponse(choix.getReponse());
       return choixRepository.save(cho);

    }

    @Override
    public List<Choix> getAllChoix() {
        return (List<Choix>) choixRepository.findAll();
    }
}
