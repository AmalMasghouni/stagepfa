package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Reponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseRepository extends CrudRepository<Reponse,Long> {
}
