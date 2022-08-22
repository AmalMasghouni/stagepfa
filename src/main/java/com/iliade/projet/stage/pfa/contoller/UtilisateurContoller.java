package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Exercice;
import com.iliade.projet.stage.pfa.entity.Utilisateur;
import com.iliade.projet.stage.pfa.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtilisateurContoller {
    @Autowired
    UtilisateurService utilisateurService;
    //Afficher les utilisateurs;
    @GetMapping("/utilisateur")
    @ResponseBody

    public List<Utilisateur> getAllUtilisateur()
    {    List<Utilisateur> list;
        list = (List<Utilisateur>) utilisateurService.getAllUtilisateur();
        return list;
    }
    //Ajouter les utilisateurs;
    @PostMapping("/ajouterutilisateur")
    @ResponseBody
    public Utilisateur  ajouterUtilisateur(@RequestBody Utilisateur u ){
        return utilisateurService.ajouterUtilisateur(u);
    }

    //Delete by Id
    @RequestMapping("/Deleteutilisateur/{id}")
    @ResponseBody
    public void deleteUtilisateurById(@PathVariable("id") Long id){
        utilisateurService.deleteUtilisateurById(id);
    }

    //Update utilisateur
    @PutMapping("/updateutilisateur")
    @ResponseBody
    public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.updateUtilisateur(utilisateur);
    }

}

