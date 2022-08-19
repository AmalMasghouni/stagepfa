package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.service.ExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExerciceContoller {
    @Autowired
    ExerciceService exerciceService;
}
