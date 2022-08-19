package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Correction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorrectionRepository extends CrudRepository<Correction,Long> {
}
