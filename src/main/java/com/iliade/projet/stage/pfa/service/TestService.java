package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Test;

import java.util.List;

public interface TestService {
   Test ajouter(Test test );
    void deleteTest(Test test);
    void deleteById(Long id);
     Test updateTest (Test test, Long id);
    List<Test> getAllTest();
}
