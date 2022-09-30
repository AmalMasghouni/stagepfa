package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import com.iliade.projet.stage.pfa.entity.Choix;
import com.iliade.projet.stage.pfa.entity.Correction;
import com.iliade.projet.stage.pfa.service.CorrectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("correction")
public class CorrectionController {
    @Autowired
    CorrectionService correctionService;
    //Afficher les corrections;
    @GetMapping("/listcorrection")
    @ResponseBody

    public List<Correction> getAllCorrection()
    {    List<Correction> list;
        list = (List<Correction>) correctionService.getAllCorrection();
        return list;
    }
    //Ajouter les Corrections;
    @PostMapping("/ajoutercorrection")
    @ResponseBody
    public Correction ajouterCorrection(@RequestBody Correction correction){
        return correctionService.ajouterCorrection(correction);
    }

    //Delete by Id
    @RequestMapping("/Deletecorrection/{id}")
    @ResponseBody
    public void deleteCorrectionById(@PathVariable("id") Long id){
        correctionService.deleteCorrectionById(id);
    }

    //Update correction
    @PutMapping("/updatecorrection/{id}")
    @ResponseBody
    public Correction updateCorrection(@RequestBody Correction correction,@PathVariable ("id") Long id) {
        return correctionService.updateCorrection(correction,id);

    }


}
