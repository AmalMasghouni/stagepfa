package com.iliade.projet.stage.pfa.service;


import com.iliade.projet.stage.pfa.entity.Candidat;

import java.util.List;

public interface CandidatService {
   Candidat ajouterCandidat(Candidat candidat);
    void deleteCandidat(Candidat candidat);
    void deleteCandidatById(Long id);
    Candidat updateCandidat (Candidat candidat,Long id);
    List<Candidat> getAllCandidat();
}
