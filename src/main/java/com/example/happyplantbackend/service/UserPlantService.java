package com.example.happyplantbackend.service;

import com.example.happyplantbackend.model.UserPlant;
import com.example.happyplantbackend.repository.UserPlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPlantService {

    @Autowired
    private final UserPlantRepository userPlantRepository;

    public UserPlantService(UserPlantRepository userPlantRepository) {
        this.userPlantRepository = userPlantRepository;
    }

    public List<UserPlant> getAllUserPlants() {
        return userPlantRepository.findAll();
    }

    public UserPlant getUserPlantById(int id) {
        return userPlantRepository.findById(id).get();
    }

    public UserPlant saveUserPlant(UserPlant userPlant) {
        return userPlantRepository.save(userPlant);
    }

    public void deleteUserPlant(int id) {
        userPlantRepository.deleteById(id);
    }
}

