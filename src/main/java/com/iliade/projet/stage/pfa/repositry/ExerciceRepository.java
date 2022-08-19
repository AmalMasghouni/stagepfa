package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Exercice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciceRepository extends CrudRepository<Exercice,Long> {
}
