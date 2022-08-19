package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.service.CorrectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorrectionController {
    @Autowired
    CorrectionService correctionService;
}
