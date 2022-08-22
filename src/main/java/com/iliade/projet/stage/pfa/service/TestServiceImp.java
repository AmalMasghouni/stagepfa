package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Test;
import com.iliade.projet.stage.pfa.entity.Utilisateur;
import com.iliade.projet.stage.pfa.repositry.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImp implements TestService {
    @Autowired
    TestRepository testRepository;

    @Override
    public Test ajouterTest(Test test) {
        testRepository.save(test);
        return test;
    }

    @Override
    public void deleteTest(Test test) {
        testRepository.delete(test);

    }

    @Override
    public void deleteTestById(Long id) {
        testRepository.deleteById(id);
    }

    @Override
    public Test updateTest(Test test) {
        return testRepository.save(test);
    }

    @Override
    public List<Test> getAllTest() {
         return(List<Test>)  testRepository.findAll();
    }
}
