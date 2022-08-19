package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;

}
