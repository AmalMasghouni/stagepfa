package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Choix;
import com.iliade.projet.stage.pfa.entity.Reponse;
import com.iliade.projet.stage.pfa.repositry.ReponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReponseServiceImp implements ReponseService {
    @Autowired
    ReponseRepository reponseRepository;
    @Override
    public Reponse ajouterReponse(Reponse reponse) {
        reponseRepository.save(reponse);
        return reponse;
    }

    @Override
    public void deleteReponse(Reponse reponse) {
        reponseRepository.delete(reponse);
    }

    @Override
    public void deleteReponseById(Long id) {
        reponseRepository.deleteById(id);
    }

    @Override
    public Reponse updateReponse(Reponse reponse,Long id) {
        Reponse r= reponseRepository.findById(id).get();
        r.setChoix(reponse.getChoix());
        r.setQuestion(reponse.getQuestion());
        return reponseRepository.save(r);

    }

    @Override
    public List<Reponse> getAllReponse() {
        return (List<Reponse> )reponseRepository.findAll();
    }
}
