package com.iliade.projet.stage.pfa.contoller;

import com.iliade.projet.stage.pfa.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {
    @Autowired
    TestService testService;
}
