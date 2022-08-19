package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Choix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoixRepository extends CrudRepository<Choix,Long> {
}
