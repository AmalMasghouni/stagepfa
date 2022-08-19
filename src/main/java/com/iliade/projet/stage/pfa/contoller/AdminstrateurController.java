package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.service.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminstrateurController {
    @Autowired
    AdministrateurService administrateurService;
}
