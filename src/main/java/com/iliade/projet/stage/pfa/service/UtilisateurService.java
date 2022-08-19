package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Utilisateur;

import java.util.List;

public interface UtilisateurService {
   Utilisateur ajouter(Utilisateur utilisateur);
    void deleteUtilisateur(Utilisateur utilisateur);
    void deleteUtilisateurById(Long id);
    Utilisateur updateUtilisateur(Utilisateur utilisateur,Long id);
    List<Utilisateur> getAllUtilisateur();
}
