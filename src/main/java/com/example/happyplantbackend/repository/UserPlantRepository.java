package com.example.happyplantbackend.repository;

import com.example.happyplantbackend.model.UserPlant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPlantRepository extends JpaRepository<UserPlant, Integer> {
}
