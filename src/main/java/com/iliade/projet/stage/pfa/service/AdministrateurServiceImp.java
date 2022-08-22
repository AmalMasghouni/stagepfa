package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import com.iliade.projet.stage.pfa.repositry.AdministrateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministrateurServiceImp implements AdministrateurService {
    @Autowired
    AdministrateurRepository administrateurRepository;
    @Override
    public Administrateur ajouterAdministrateur(Administrateur administrateur) {
        administrateurRepository.save(administrateur);
        return administrateur;
    }

    @Override
    public void deleteAdministrateur(Administrateur administrateur) {
        administrateurRepository.delete(administrateur);
    }

    @Override
    public void deleteAdministrateurById(Long id) {
        administrateurRepository.deleteById(id);
    }

    @Override
    public Administrateur updateAdministrateur(Administrateur administrateur) {
        return administrateurRepository.save(administrateur);
    }

    @Override
    public List<Administrateur> getAllAdministrateur() {
        return (List<Administrateur>) administrateurRepository.findAll() ;
    }
}
