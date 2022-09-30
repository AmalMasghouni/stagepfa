package com.iliade.projet.stage.pfa.service;


import com.iliade.projet.stage.pfa.entity.Correction;
import com.iliade.projet.stage.pfa.repositry.CorrectionRepository;

import java.util.List;

public interface CorrectionService {
   Correction ajouterCorrection(Correction correction);
    void deleteCorrection(Correction correction);
    void deleteCorrectionById(Long id);
    Correction updateCorrection (Correction correction , Long id);
    List<Correction> getAllCorrection ();
}
