package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Question;
import com.iliade.projet.stage.pfa.repositry.QuestionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService {
    @Autowired
    QuestionRespository questionRespository;
    @Override
    public Question ajouterQuestion(Question question) {
        questionRespository.save(question);
        return question;
    }

    @Override
    public void deleteQuestion(Question question) {
        questionRespository.delete(question);
    }

    @Override
    public void deleteQuestionById(Long id) {
        questionRespository.deleteById(id);
    }

    @Override
    public Question updateQuestion(Question question) {
        return questionRespository.save(question);
    }

    @Override
    public List<Question> getAllQuestion() {
        return (List<Question>) questionRespository.findAll();
    }
}
