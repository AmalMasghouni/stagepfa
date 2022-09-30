package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Choix;
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
    public Question updateQuestion(Question question,Long id) {
        Question q= questionRespository.findById(id).get();
        q.setType_question(question.getType_question());
        q.setQuestion(question.getQuestion());
        q.setNote_question(question.getNote_question());
        q.setExercice(question.getExercice());
        q.setReponse(question.getReponse());
        q.setCorrection(question.getCorrection());

        return questionRespository.save(q);

    }

    @Override
    public List<Question> getAllQuestion() {
        return (List<Question>) questionRespository.findAll();
    }
}
