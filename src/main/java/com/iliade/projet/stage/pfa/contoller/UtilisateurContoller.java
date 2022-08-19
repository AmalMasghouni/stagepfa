package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UtilisateurContoller {
    @Autowired
    UtilisateurService utilisateurService;
}

