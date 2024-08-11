package com.example.happyplantbackend.repository;

import com.example.happyplantbackend.model.WateringSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WateringScheduleRepository extends JpaRepository<WateringSchedule, Integer> {
}
