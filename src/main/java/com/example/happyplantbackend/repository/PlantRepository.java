package com.example.happyplantbackend.repository;

import com.example.happyplantbackend.model.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantRepository extends JpaRepository<Plant,Integer> {
}

