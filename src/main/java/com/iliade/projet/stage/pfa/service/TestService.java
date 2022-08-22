package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Test;

import java.util.List;

public interface TestService {
   Test ajouterTest(Test test );
    void deleteTest(Test test);
    void deleteTestById(Long id);
     Test updateTest (Test test);
    List<Test> getAllTest();
}
