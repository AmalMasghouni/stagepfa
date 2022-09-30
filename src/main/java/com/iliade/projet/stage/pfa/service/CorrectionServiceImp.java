package com.iliade.projet.stage.pfa.service;

import com.iliade.projet.stage.pfa.entity.Choix;
import com.iliade.projet.stage.pfa.entity.Correction;
import com.iliade.projet.stage.pfa.repositry.CorrectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorrectionServiceImp  implements CorrectionService{
    @Autowired
    CorrectionRepository correctionRepository;
    @Override
    public Correction ajouterCorrection(Correction correction) {
        correctionRepository.save(correction);
        return correction;
    }

    @Override
    public void deleteCorrection(Correction correction) {
        correctionRepository.delete(correction);
    }

    @Override
    public void deleteCorrectionById(Long id) {
        correctionRepository.deleteById(id);
    }

    @Override
    public Correction updateCorrection(Correction correction , Long id) {
        Correction corr= correctionRepository.findById(id).get();
        corr.setQuestion(correction.getQuestion());
        corr.setChoix(correction.getChoix());

        return correctionRepository.save(corr);
    }

    @Override
    public List<Correction> getAllCorrection() {
        return (List<Correction>) correctionRepository.findAll() ;
    }
}
