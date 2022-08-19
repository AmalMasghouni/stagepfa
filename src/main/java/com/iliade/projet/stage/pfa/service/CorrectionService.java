package com.iliade.projet.stage.pfa.service;


import com.iliade.projet.stage.pfa.entity.Correction;
import com.iliade.projet.stage.pfa.repositry.CorrectionRepository;

import java.util.List;

public interface CorrectionService {
   Correction ajouter(Correction correction);
    void deleteCorrection(Correction correction);
    void deleteCorrectionById(Long id);
    Correction updateCorrection (Correction Correction, Long id);
    List<Correction> getAllCorrection ();
}
