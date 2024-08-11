package com.example.happyplantbackend.controller;

import com.example.happyplantbackend.model.WateringSchedule;
import com.example.happyplantbackend.service.WateringScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wateringschedules")
public class WateringScheduleController {

    private final WateringScheduleService wateringScheduleService;

    @Autowired
    public WateringScheduleController(WateringScheduleService wateringScheduleService) {
        this.wateringScheduleService = wateringScheduleService;
    }

    @GetMapping
    public List<WateringSchedule> getAllWateringSchedules() {
        return wateringScheduleService.getAllWateringSchedules();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WateringSchedule> getWateringScheduleById(@PathVariable int id) {
        WateringSchedule wateringSchedule = wateringScheduleService.getWateringScheduleById(id);

        if (wateringSchedule == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(wateringSchedule);
    }

    @PutMapping("/{id}")
    public ResponseEntity<WateringSchedule> updateWateringSchedule(@PathVariable int id, @RequestBody WateringSchedule wateringScheduleDetails) {
        WateringSchedule wateringSchedule = wateringScheduleService.getWateringScheduleById(id);

        if (wateringSchedule == null) {
            return ResponseEntity.notFound().build();
        }

        wateringSchedule.setLastWatering(wateringScheduleDetails.getLastWatering());
        wateringSchedule.setUserPlantId(wateringScheduleDetails.getUserPlantId());
        wateringSchedule.setNextWatering(wateringScheduleDetails.getNextWatering());
        WateringSchedule updatedWateringSchedule = wateringScheduleService.saveWateringSchedule(wateringSchedule);

        return ResponseEntity.ok(updatedWateringSchedule);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWateringSchedule(@PathVariable int id) {
        WateringSchedule wateringSchedule = wateringScheduleService.getWateringScheduleById(id);

        if (wateringSchedule == null) {
            return ResponseEntity.notFound().build();
        }

        wateringScheduleService.deleteWateringSchedule(id);

        return ResponseEntity.noContent().build();
    }
}

