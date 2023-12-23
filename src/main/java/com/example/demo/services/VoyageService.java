package com.example.demo.services;

import com.example.demo.models.voyage;
import com.example.demo.repository.VoyageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoyageService {

    private final VoyageRepository voyageRepository;

    @Autowired
    public VoyageService(VoyageRepository voyageRepository) {
        this.voyageRepository = voyageRepository;
    }

    public List<voyage> getAllVoyages() {
        return voyageRepository.findAll();
    }

    public Optional<voyage> getVoyageById(String id) {
        return voyageRepository.findById(id);
    }

    public voyage createVoyage(voyage voyage) {
        return voyageRepository.save(voyage);
    }

    public voyage updateVoyage(String id, voyage updatedVoyage) {
        if (voyageRepository.existsById(id)) {
            updatedVoyage.setId(id);
            return voyageRepository.save(updatedVoyage);
        } else {
            throw new RuntimeException("Voyage not found");
        }
    }

    public void deleteVoyage(String id) {
        voyageRepository.deleteById(id);
    }
}
