package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Exercice;
import com.iliade.projet.stage.pfa.entity.Test;
import com.iliade.projet.stage.pfa.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestContoller {
    @Autowired
    TestService testService;
    //Afficher les tests;
    @GetMapping("/test")
    @ResponseBody

    public List<Test> getAllTest()
    {    List<Test> list;
        list = (List<Test>) testService.getAllTest();
        return list;
    }
    //Ajouter les tests;
    @PostMapping("/ajoutertest")
    @ResponseBody
    public Test  ajouterTest(@RequestBody Test test){
        return testService.ajouterTest(test);
    }

    //Delete by Id
    @RequestMapping("/Deletetest/{id}")
    @ResponseBody
    public void deleteTestById(@PathVariable("id") Long id){
        testService.deleteTestById(id);
    }

    //Update test
    @PutMapping("/updatetest")
    @ResponseBody
    public Test updateTest(@RequestBody Test test) {
        return testService.updateTest(test);
    }

}
