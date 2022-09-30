package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import com.iliade.projet.stage.pfa.entity.Exercice;
import com.iliade.projet.stage.pfa.entity.Poste;
import com.iliade.projet.stage.pfa.service.PosteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("poste")
public class PosteController {
    @Autowired
    PosteService posteService;
    //Afficher les postes;
    @GetMapping("/listposte")
    @ResponseBody

    public List<Poste> getAllPoste()
    {    List<Poste> list;
        list = (List<Poste>) posteService.getAllPoste();
        return list;
    }
    //Ajouter les postes;
    @PostMapping("/ajouterposte")
    @ResponseBody
    public Poste  ajouterExercice(@RequestBody Poste poste){
        return posteService.ajouterPoste(poste);
    }

    //Delete by Id
    @RequestMapping("/Deleteposte/{id}")
    @ResponseBody
    public void deletePosteById(@PathVariable("id") Long id){
        posteService.deletePosteById(id);
    }

    //Update poste
    @PutMapping("/updateposte/{id}")
    @ResponseBody
    public Poste updatePoste(@RequestBody Poste poste,@PathVariable ("id") Long id) {
        return posteService.updatePoste(poste,id);
    }

}
