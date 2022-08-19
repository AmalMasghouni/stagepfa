package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Poste;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosteRepository extends CrudRepository<Poste,Long> {
}
