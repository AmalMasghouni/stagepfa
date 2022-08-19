package com.iliade.projet.stage.pfa.repositry;

import com.iliade.projet.stage.pfa.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends CrudRepository<Utilisateur,Long> {
}
