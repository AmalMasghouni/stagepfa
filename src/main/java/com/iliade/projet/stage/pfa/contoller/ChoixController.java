package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import com.iliade.projet.stage.pfa.entity.Choix;
import com.iliade.projet.stage.pfa.service.ChoixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("choix")
public class ChoixController {
    @Autowired
    ChoixService choixService;
    //Afficher les choix;
    @GetMapping("/listchoix")
    @ResponseBody
    public List<Choix> getAllChoix()
    {    List<Choix> list;
        list = (List<Choix>) choixService.getAllChoix();
        return list;
    }
    //Ajouter les choix;
    @PostMapping("/ajouterchoix")
    @ResponseBody
    public Choix ajouterChoix(@RequestBody Choix choix){
        return choixService.ajouterChoix(choix);
    }

    //Delete by Id
    @RequestMapping("/Deletechoix/{id}")
    @ResponseBody
    public void deleteChoixById(@PathVariable("id") Long id){
        choixService.deleteChoixById(id);
    }

    //Update choix
    @PutMapping("/updatechoix/{id}")
    @ResponseBody
    public Choix updateChoix(@RequestBody  Choix choix,@PathVariable ("id") Long id) {
        return choixService.updateChoix(choix,id);
    }


}
