package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Poste;
import com.iliade.projet.stage.pfa.repositry.PosteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PosteServiceImp implements PosteService {
    @Autowired
    PosteRepository posteRepository;
    @Override
    public Poste ajouter(Poste poste) {
        posteRepository.save(poste);
        return poste;
    }

    @Override
    public void deletePoste(Poste poste) {

        posteRepository.delete(poste);
    }

    @Override
    public void deletePosteById(Long id) {
        posteRepository.deleteById(id);

    }

    @Override
    public Poste updatePoste(Poste poste, Long id) {
        return null;
    }

    @Override
    public List<Poste> getAllPoste() {
        return (List<Poste>) posteRepository.findAll();
    }
}
