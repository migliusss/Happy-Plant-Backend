package com.example.happyplantbackend.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "watering_schedule")
public class WateringSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "watering_id")
    private int watering_id;

    @Column(name = "last_watering")
    private Date last_watering;

    @Column(name = "next_watering")
    private Date next_watering;

    @ManyToOne
    @JoinColumn(name = "user_plant_id")
    private UserPlant user_plant_id;

    // Getters and setters.
    public int getWateringId() {
        return watering_id;
    }

    public void setWateringId(int watering_id) {
        this.watering_id = watering_id;
    }

    public Date getLastWatering() {
        return last_watering;
    }

    public void setLastWatering(Date lastWatering) {
        this.last_watering = lastWatering;
    }

    public Date getNextWatering() {
        return next_watering;
    }

    public void setNextWatering(Date nextWatering) {
        this.next_watering = nextWatering;
    }

    public UserPlant getUserPlantId() {
        return user_plant_id;
    }

    public void setUserPlantId(UserPlant userPlantId) {
        this.user_plant_id = userPlantId;
    }
}

