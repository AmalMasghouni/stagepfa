package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import com.iliade.projet.stage.pfa.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admi")
public class AdminstrateurController {
    @Autowired
    AdministrateurService administrateurService;
    //Afficher les admins;
   @GetMapping("/administrateur")
    @ResponseBody

   public List<Administrateur> getAllAdministrateur()
   {    List<Administrateur> list;
       list = (List<Administrateur>) administrateurService.getAllAdministrateur();
       return list;
   }
   //Ajouter les admins;
    @PostMapping("/ajouteradministrateurs")
    @ResponseBody
    public Administrateur ajouterAdministrateur(@RequestBody Administrateur administrateur){
       return administrateurService.ajouterAdministrateur(administrateur);
   }

   //Delete by Id
  @RequestMapping("/Deleteadministrateur/{id}")
    @ResponseBody
    public void deleteAdministrateurById(@PathVariable("id") Long id){
        administrateurService.deleteAdministrateurById(id);
    }

    //Update admin
    @PutMapping("/updateadministrateur")
    @ResponseBody
    public Administrateur updateAdministrateur(@RequestBody Administrateur administrateur) {
        return administrateurService.updateAdministrateur(administrateur);
    }




}
