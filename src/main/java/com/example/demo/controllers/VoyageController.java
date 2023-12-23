package com.example.demo.controllers;

import com.example.demo.models.voyage;
import com.example.demo.services.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/voyages")
public class VoyageController {

    private final VoyageService voyageService;

    @Autowired
    public VoyageController(VoyageService voyageService) {
        this.voyageService = voyageService;
    }

    @GetMapping("/getAll")
    public List<voyage> getAllVoyages() {
        return voyageService.getAllVoyages();
    }

    @GetMapping("/getById{id}")
    public Optional<voyage> getVoyageById(@PathVariable String id) {
        return voyageService.getVoyageById(id);
    }

    @PostMapping("/create")
    public voyage createVoyage(@RequestBody voyage Voyage) {
        return voyageService.createVoyage(Voyage);
    }
    //logger.info("Received a request to create a new voyage.");

    @PutMapping("/update{id}")
    public voyage updateVoyage(@PathVariable String id, @RequestBody voyage updatedVoyage) {
        return voyageService.updateVoyage(id, updatedVoyage);
    }

    @DeleteMapping("/delete{id}")
    public void deleteVoyage(@PathVariable String id) {
        voyageService.deleteVoyage(id);
    }
}
