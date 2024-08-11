package com.example.happyplantbackend.controller;

import com.example.happyplant.model.Plant;
import com.example.happyplant.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plants")
public class PlantController {

    private final PlantService plantService;

    @Autowired
    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping
    public List<Plant> getAllPlants(){
        return plantService.getAllPlants();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plant> getPlantById(@PathVariable int id) {
        Plant plant = plantService.getPlantById(id);

        if (plant == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(plant);
    }

    @PostMapping
    public Plant createPlant(@RequestBody Plant plant) {
        return plantService.savePlant(plant);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plant> updatePlant(@PathVariable int id, @RequestBody Plant plantDetails) {
        Plant plant = plantService.getPlantById(id);

        if (plant == null) {
            return ResponseEntity.notFound().build();
        }

        plant.setName(plantDetails.getName());
        plant.setName(plantDetails.getName());
        plant.setLatinName(plantDetails.getLatinName());
        plant.setLight(plantDetails.getLight());
        plant.setWater(plantDetails.getWater());
        plant.setFertilize(plantDetails.getFertilize());
        plant.setNotes(plantDetails.getNotes());

        Plant updatedPlant = plantService.savePlant(plant);

        return ResponseEntity.ok(updatedPlant);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlant(@PathVariable int id) {
        Plant plant = plantService.getPlantById(id);

        if (plant == null) {
            return ResponseEntity.notFound().build();
        }

        plantService.deletePlantById(id);

        return ResponseEntity.noContent().build();
    }
}
