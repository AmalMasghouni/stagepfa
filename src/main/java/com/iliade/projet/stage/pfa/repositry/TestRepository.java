package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test,Long> {
}
