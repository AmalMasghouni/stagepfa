package com.iliade.projet.stage.pfa.service;


import com.iliade.projet.stage.pfa.entity.Poste;

import java.util.List;

public interface PosteService {
    Poste ajouterPoste(Poste poste);
    void deletePoste(Poste poste);
    void deletePosteById(Long id);
   Poste updatePoste (Poste poste);
    List<Poste> getAllPoste();
}
