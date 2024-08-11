package com.example.happyplantbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_plants")
public class UserPlant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_plant_id")
    private int user_plant_id;

    @Column(name = "user_plant_name")
    private String user_plant_name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "plant_id")
    private Plant plant;

    // Getters and setters.
    public int getUserPlantId() {
        return user_plant_id;
    }

    public void setUserPlantId(int userPlantId) {
        this.user_plant_id = userPlantId;
    }

    public String getUserPlantName() {
        return user_plant_name;
    }

    public void setUserPlantName(String userPlantName) {
        this.user_plant_name = userPlantName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}

