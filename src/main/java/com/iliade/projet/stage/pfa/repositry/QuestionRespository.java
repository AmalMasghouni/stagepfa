package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRespository extends CrudRepository<Question,Long> {
}
