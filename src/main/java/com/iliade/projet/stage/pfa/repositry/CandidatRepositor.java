package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Candidat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatRepositor extends CrudRepository<Candidat,Long> {
}
