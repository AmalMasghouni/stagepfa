package com.iliade.projet.stage.pfa.service;


import com.iliade.projet.stage.pfa.entity.Reponse;

import java.util.List;

public interface ReponseService {
   Reponse ajouterReponse(Reponse reponse);
    void deleteReponse(Reponse reponse);
    void deleteReponseById(Long id);
    Reponse updateReponse (Reponse reponse,Long id);
    List<Reponse> getAllReponse();
}
