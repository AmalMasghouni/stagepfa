package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Administrateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrateurRepository extends CrudRepository<Administrateur,Long> {
}
