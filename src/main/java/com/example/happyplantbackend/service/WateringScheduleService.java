package com.example.happyplantbackend.service;

import com.example.happyplantbackend.model.WateringSchedule;
import com.example.happyplantbackend.repository.WateringScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WateringScheduleService {

    @Autowired
    private final WateringScheduleRepository wateringScheduleRepository;

    public WateringScheduleService(WateringScheduleRepository wateringScheduleRepository) {
        this.wateringScheduleRepository = wateringScheduleRepository;
    }

    public List<WateringSchedule> getAllWateringSchedules() {
        return wateringScheduleRepository.findAll();
    }

    public WateringSchedule getWateringScheduleById(int wateringScheduleId) {
        return wateringScheduleRepository.findById(wateringScheduleId).get();
    }

    public WateringSchedule saveWateringSchedule(WateringSchedule wateringSchedule) {
        return wateringScheduleRepository.save(wateringSchedule);
    }

    public void deleteWateringSchedule(int wateringScheduleId) {
        wateringScheduleRepository.deleteById(wateringScheduleId);
    }
}

