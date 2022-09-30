package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Choix;
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
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
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
   public Utilisateur updateUtilisateur(Utilisateur utilisateur,Long id) {
       Utilisateur u= utilisateurRepository.findById(id).get();
       u.setLogin(utilisateur.getLogin());
       u.setMot_de_passe(utilisateur.getMot_de_passe());
       u.setEmail(utilisateur.getEmail());
       u.setPhone(utilisateur.getPhone());
       u.setPays(utilisateur.getPays());
       u.setAdresse(utilisateur.getAdresse());
       u.setType_utilisateur(utilisateur.getType_utilisateur());
       u.setAdministrateur(utilisateur.getAdministrateur());
       u.setCandidat(utilisateur.getCandidat());

       return utilisateurRepository.save(u);

   }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return(List<Utilisateur>)  utilisateurRepository.findAll();
    }
}
