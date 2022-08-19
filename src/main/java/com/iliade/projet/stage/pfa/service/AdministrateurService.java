package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Administrateur;

import java.util.List;

public interface AdministrateurService {
    Administrateur ajouterAdministrateur(Administrateur administrateur);
    void deleteAdministrateur(Administrateur administrateur);
    void deleteAdministrateurById(Long id);
   Administrateur updateAdministrateur (Administrateur administrateur,Long id);
    List<Administrateur> getAllAdministrateur();
}
