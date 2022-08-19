package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Utilisateur;
import com.iliade.projet.stage.pfa.repositry.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImp implements UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur ajouter(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
        return utilisateur;

    }

    @Override
    public void deleteUtilisateur(Utilisateur utilisateur) {
        utilisateurRepository.delete(utilisateur);

    }

    @Override
    public void deleteUtilisateurById(Long id) {
        utilisateurRepository.deleteById(id);

    }

   @Override
   public Utilisateur updateUtilisateur(Utilisateur utilisateur, Long id) {
        /*Utilisateur utilisateur = utilisateurRepository.findById(id).get()


        utilisateur.setId(employeeDetails.getEmailId());
        utilisateur.s(employeeDetails.getLastName());
        utilisateur.setFirstName(employeeDetails.getFirstName());
        final Utilisateur updatedUtilisateur = utilisateurRepository.save(utilisateur);
        return updatedUtilisateur;*/
       return null;
    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return(List<Utilisateur>)  utilisateurRepository.findAll();
    }
}
