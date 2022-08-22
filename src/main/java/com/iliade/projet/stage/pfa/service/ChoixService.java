package com.iliade.projet.stage.pfa.service;



import com.iliade.projet.stage.pfa.entity.Choix;

import java.util.List;

public interface ChoixService {
    Choix ajouterChoix(Choix choix );
    void deleteChoix(Choix choix);
    void deleteChoixById(Long id);
    Choix updateChoix (Choix choix , Long id);
    List<Choix> getAllChoix();
}
