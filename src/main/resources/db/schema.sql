-- Create Plants Table
CREATE TABLE IF NOT EXISTS plants
(
    plant_id   INT AUTO_INCREMENT PRIMARY KEY,
    name      VARCHAR(100) NOT NULL,
    latin_name VARCHAR(100),
    light     VARCHAR(50),
    water     VARCHAR(50),
    fertilize VARCHAR(50),
    notes     VARCHAR(200),
    UNIQUE (name, latin_name)
    );

-- Create Users Table
CREATE TABLE IF NOT EXISTS users
(
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    name   VARCHAR(100) NOT NULL,
    UNIQUE (name)
    );

-- Create UserPlants Table
CREATE TABLE IF NOT EXISTS user_plants
(
    user_plant_id INT AUTO_INCREMENT PRIMARY KEY,
    user_plant_name VARCHAR(100),
    user_id        INT,
    plant_id       INT,
    UNIQUE (user_plant_name, user_id, plant_id),
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (plant_id) REFERENCES plants (plant_id)
    );

-- Create WateringSchedule Table
CREATE TABLE IF NOT EXISTS watering_schedule
(
    watering_id INT AUTO_INCREMENT PRIMARY KEY,
    last_watering  DATE,
    next_watering  DATE,
    user_plant_id INT,
    FOREIGN KEY (user_plant_id) REFERENCES user_plants (user_plant_id)
    );