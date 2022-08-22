package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Candidat;
import com.iliade.projet.stage.pfa.repositry.CandidatRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatServiceImp implements  CandidatService{
    @Autowired
    CandidatRepositor candidatRepositor;
    @Override
    public Candidat ajouterCandidat(Candidat candidat) {

        candidatRepositor.save(candidat);
        return candidat;
    }

    @Override
    public void  deleteCandidat(Candidat candidat) {
        candidatRepositor.delete(candidat);
    }

    @Override
    public void deleteCandidatById(Long id) {
        candidatRepositor.deleteById(id);
    }

    @Override
    public Candidat updateCandidat(Candidat candidat) {
       return candidatRepositor.save(candidat);
    }

    @Override
    public List<Candidat> getAllCandidat() {
            return (List<Candidat>)  candidatRepositor.findAll();
    }
}
