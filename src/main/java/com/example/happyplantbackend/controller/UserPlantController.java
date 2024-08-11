package com.example.happyplantbackend.controller;

import com.example.happyplantbackend.model.UserPlant;
import com.example.happyplantbackend.service.UserPlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userplants")
public class UserPlantController {

    private final UserPlantService userPlantService;

    @Autowired
    public UserPlantController(UserPlantService userPlantService) {
        this.userPlantService = userPlantService;
    }

    @GetMapping
    public List<UserPlant> getAllUserPlants() {
        return userPlantService.getAllUserPlants();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserPlant> getUserPlantById(@PathVariable int id) {
        UserPlant userPlant = userPlantService.getUserPlantById(id);

        if (userPlant == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(userPlant);
    }

    @PostMapping
    public UserPlant createUserPlant(@RequestBody UserPlant userPlant) {
        return userPlantService.saveUserPlant(userPlant);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserPlant> updateUserPlant(@PathVariable int id, @RequestBody UserPlant userPlantDetails) {
        UserPlant userPlant = userPlantService.getUserPlantById(id);

        if (userPlant == null) {
            return ResponseEntity.notFound().build();
        }

        userPlant.setUserPlantName(userPlantDetails.getUserPlantName());
        userPlant.setUser(userPlantDetails.getUser());
        userPlant.setPlant(userPlantDetails.getPlant());

        UserPlant updatedUserPlant = userPlantService.saveUserPlant(userPlant);

        return ResponseEntity.ok(updatedUserPlant);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserPlant(@PathVariable int id) {
        UserPlant userPlant = userPlantService.getUserPlantById(id);

        if (userPlant == null) {
            return ResponseEntity.notFound().build();
        }

        userPlantService.deleteUserPlant(id);

        return ResponseEntity.noContent().build();
    }
}
