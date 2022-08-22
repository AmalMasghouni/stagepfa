package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import com.iliade.projet.stage.pfa.entity.Exercice;
import com.iliade.projet.stage.pfa.service.ExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExerciceContoller {
    @Autowired
    ExerciceService exerciceService;
    //Afficher les exericices;
    @GetMapping("/exercice")
    @ResponseBody

    public List<Exercice> getAllExercice()
    {    List<Exercice> list;
        list = (List<Exercice>) exerciceService.getAllExercice();
        return list;
    }
    //Ajouter les exercices;
    @PostMapping("/ajouterexercice")
    @ResponseBody
    public Exercice  ajouterExercice(@RequestBody Exercice exercice){
        return exerciceService.ajouterExercice(exercice);
    }

    //Delete by Id
    @RequestMapping("/Deleteexercice/{id}")
    @ResponseBody
    public void deleteExerciceById(@PathVariable("id") Long id){
        exerciceService.deleteExerciceById(id);
    }

    //Update exercice
    @PutMapping("/updateexercice")
    @ResponseBody
    public Exercice updateExercice(@RequestBody Exercice exercice) {
        return exerciceService.updateExercice(exercice);
    }


}
