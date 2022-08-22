package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.entity.Exercice;
import com.iliade.projet.stage.pfa.entity.Question;
import com.iliade.projet.stage.pfa.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;
    //Afficher les questions;
    @GetMapping("/question")
    @ResponseBody

    public List<Question> getAllquestion()
    {    List<Question> list;
        list = (List<Question>) questionService.getAllQuestion();
        return list;
    }
    //Ajouter les questions;
    @PostMapping("/ajouterquestion")
    @ResponseBody
    public Question  ajouterQuestion(@RequestBody Question question){
        return questionService.ajouterQuestion(question);
    }

    //Delete by Id
    @RequestMapping("/Deletequestion/{id}")
    @ResponseBody
    public void deleteQuestionById(@PathVariable("id") Long id){
        questionService.deleteQuestionById(id);
    }

    //Update question
    @PutMapping("/updatequestion")
    @ResponseBody
    public Question updateQuestion(@RequestBody Question question) {
        return questionService.updateQuestion(question);
    }

}
