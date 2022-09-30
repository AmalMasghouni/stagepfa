package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import com.iliade.projet.stage.pfa.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("administrateur")
public class AdminstrateurController {

    @Autowired
    AdministrateurService administrateurService;
    //Afficher les admins;
   @GetMapping("/listadministrateur")
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
    @PutMapping("/updateadministrateur/{id}")
    @ResponseBody
    public Administrateur updateAdministrateur(@RequestBody Administrateur administrateur, @PathVariable ("id") Long id) {
        return administrateurService.updateAdministrateur(administrateur,id);
    }




}
