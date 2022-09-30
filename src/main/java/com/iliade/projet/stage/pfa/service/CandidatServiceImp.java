package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Administrateur;
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
    public Candidat updateCandidat(Candidat candidat, Long id) {
        Candidat c= candidatRepositor.findById(id).get();
        c.setNom(candidat.getNom());
        c.setPrenom(candidat.getPrenom());
        c.setNationnalite(candidat.getNationnalite());
        c.setEcole(candidat.getEcole());
        c.setDiplome(candidat.getDiplome());
        c.setSpecialite(candidat.getSpecialite());
        c.setNiveau(candidat.getNiveau());
        c.setUtilisateur(candidat.getUtilisateur());
        c.setPoste(candidat.getPoste());
        c.setTests(candidat.getTests());

        return candidatRepositor.save(candidat);
    }

    @Override
    public List<Candidat> getAllCandidat() {
            return (List<Candidat>)  candidatRepositor.findAll();
    }
}
