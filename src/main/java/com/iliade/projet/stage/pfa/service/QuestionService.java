package com.iliade.projet.stage.pfa.service;


import com.iliade.projet.stage.pfa.entity.Question;

import java.util.List;

public interface QuestionService {
    Question ajouter(Question question);
    void deleteQuestion(Question question);
    void deleteQuestionById(Long id);
    Question updateQuestion (Question question, Long id);
    List<Question> getAllQuestion();
}
