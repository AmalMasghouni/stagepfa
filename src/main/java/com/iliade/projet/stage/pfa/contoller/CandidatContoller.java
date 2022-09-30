package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import com.iliade.projet.stage.pfa.entity.Candidat;
import com.iliade.projet.stage.pfa.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("candidat")
public class CandidatContoller {
    @Autowired
    CandidatService candidatService;
    //Afficher les candidats;
    @GetMapping("/listcandidat")
    @ResponseBody

    public List<Candidat> getAllCandidat()
    {    List<Candidat> list;
        list = (List<Candidat>) candidatService.getAllCandidat();
        return list;
    }
    //Ajouter les candidats;
    @PostMapping("/ajoutercandidat")
    @ResponseBody
    public Candidat ajouterCandidat(@RequestBody Candidat candidat){
        return candidatService.ajouterCandidat(candidat);
    }

    //Delete by Id
    @RequestMapping("/Deletecandidat/{id}")
    @ResponseBody
    public void deleteCandidatById(@PathVariable("id") Long id){
        candidatService.deleteCandidatById(id);
    }

    //Update candidat
    @PutMapping("/updatecandidt/{id}")
    @ResponseBody
    public Candidat updateCandidat(@RequestBody Candidat candidat , @PathVariable ("id") Long id) {
        return candidatService.updateCandidat(candidat,id);
    }


}
