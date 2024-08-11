package com.example.happyplantbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="plant_id")
    private int plant_id;

    @Column(name="name")
    private String name;

    @Column(name="latin_name")
    private String latin_name;

    @Column(name="light")
    private String light;

    @Column(name="water")
    private String water;

    @Column(name="fertilize")
    private String fertilize;

    @Column(name="notes")
    private String notes;

    // Getters and setters.
    public int getPlantId() {
        return plant_id;
    }

    public void setPlantId(int plantId) {
        this.plant_id = plantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latin_name;
    }

    public void setLatinName(String latinName) {
        this.latin_name = latinName;
    }

    public String getLight() {
        return light;
    }

    public void setLight(String light) {
        this.light = light;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFertilize() {
        return fertilize;
    }

    public void setFertilize(String fertilize) {
        this.fertilize = fertilize;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}


