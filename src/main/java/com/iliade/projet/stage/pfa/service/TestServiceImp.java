package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Choix;
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
    public Test updateTest(Test test,Long id) {
        Test t= testRepository.findById(id).get();
        t.setType_test(test.getType_test());
       t.setStatut_test(test.getStatut_test());
       t.setNote_test(test.getNote_test());
       t.setCandidats(test.getCandidats());
       t.setExercice(test.getExercice());
       t.setResultat_test(test.getResultat_test());
       t.setPoste(test.getPoste());
        return testRepository.save(t);

    }

    @Override
    public List<Test> getAllTest() {
         return(List<Test>)  testRepository.findAll();
    }
}
