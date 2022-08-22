package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Exercice;
import com.iliade.projet.stage.pfa.entity.Reponse;
import com.iliade.projet.stage.pfa.service.ReponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReponseContoller {
    @Autowired
    ReponseService reponseService;
    //Afficher les reponses;
    @GetMapping("/reponse")
    @ResponseBody

    public List<Reponse> getAllReponse()
    {    List<Reponse> list;
        list = (List<Reponse>) reponseService.getAllReponse();
        return list;
    }
    //Ajouter les reponse;
    @PostMapping("/ajouterreponse")
    @ResponseBody
    public Reponse  ajouterReponse(@RequestBody Reponse reponse){
        return reponseService.ajouterReponse(reponse);
    }

    //Delete by Id
    @RequestMapping("/Deletereponse/{id}")
    @ResponseBody
    public void deleteReponseById(@PathVariable("id") Long id){
        reponseService.deleteReponseById(id);
    }

    //Update reponse
    @PutMapping("/updatereponse")
    @ResponseBody
    public Reponse updateReponse(@RequestBody Reponse reponse ) {
        return reponseService.updateReponse(reponse);
    }

}
