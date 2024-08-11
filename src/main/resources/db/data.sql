-- Insert initial data into plants table
INSERT INTO plants (name, latin_name, light, water, fertilize, notes)
VALUES ('Yucca', 'Yucca gigantea', 'Bright indirect light', 'Every 2-3 weeks', 'Every 2-3 months',
        'Tolerates drought well, avoid overwatering.'),
       ('ZZ Plant', 'Zamioculcas zamiifolia', 'Low to bright indirect light', 'Every 2-3 weeks', 'Every 3-4 months',
        'Very low maintenance, can tolerate neglect.'),
       ('Spider Plant', 'Chlorophytum comosum', 'Bright indirect light', 'Weekly', 'Monthly',
        'Produces "babies" that can be propagated. Safe for pets.'),
       ('Swiss Cheese Plant', 'Monstera deliciosa', 'Bright indirect light', 'Weekly', 'Monthly',
        'Prefers humidity. Allow soil to dry between waterings.'),
       ('Money Tree', 'Pachira aquatica', 'Bright indirect light', 'Weekly', 'Monthly',
        'Likes high humidity. Water thoroughly but infrequently.'),
       ('Fiddle Leaf Fig', 'Ficus lyrata', 'Bright indirect light', 'Weekly', 'Monthly',
        'Keep away from drafts. Rotate occasionally for even growth.'),
       ('Snake Plant', 'Sansevieria trifasciata "Superba"', 'Low to bright indirect light', 'Every 2-3 weeks',
        'Every 2-3 months', 'Tolerates low light and irregular watering. Good air purifier.'),
       ('Boston Fern', 'Nephrolepis exaltata "Green Lady"', 'Indirect light', 'Weekly', 'Monthly',
        'Prefers high humidity. Mist regularly and keep soil moist.'),
       ('Happy Bean', 'Peperomia ferreyrae "Nevada"', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings.'),
       ('Pepperspot', 'Peperomia "Pepperspot"', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings.'),
       ('Raindrop Peperomia', 'Peperomia polybotrya "Raindrop"', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings.'),
       ('String of Turtles', 'Peperomia rotundifolia', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings.'),
       ('Chinese Money Plant', 'Pilea peperomioides', 'Bright indirect light', 'Weekly', 'Monthly',
        'Rotate regularly for even growth. Prefers humidity.'),
       ('Baby Rubber Plant', 'Peperomia obtusifolia', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings.'),
       ('Lemon Button Fern', 'Nephrolepis cordifolia "Duffii"', 'Indirect light', 'Weekly', 'Monthly',
        'Prefers high humidity. Mist regularly and keep soil moist.'),
       ('Philodendron', 'Philodendron "White Measure"', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings. Prefers humidity.'),
       ('Giant White Bird of Paradise', 'Strelitzia nicolai', 'Bright indirect light', 'Weekly', 'Monthly',
        'Prefers high humidity. Allow soil to dry between waterings.'),
       ('Canary Island Date Palm', 'Phoenix canariensis', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings. Prefers humidity.'),
       ('Weeping Fig', 'Ficus benjamina "Danielle"', 'Bright indirect light', 'Weekly', 'Monthly',
        'Sensitive to changes in environment. Prefers humidity.'),
       ('Fiddle Leaf Fig', 'Ficus lyrata', 'Bright indirect light', 'Weekly', 'Monthly',
        'Keep away from drafts. Rotate occasionally for even growth.'),
       ('Jade Plant', 'Crassula ovata HULK', 'Bright indirect light', 'Every 2-3 weeks', 'Every 2-3 months',
        'Allow soil to dry between waterings. Prefers dry conditions.'),
       ('Aloe Vera', 'Aloe vera', 'Bright light', 'Every 3 weeks', 'Every 6 months',
        'Allow soil to dry completely between waterings. Good for burns and skin treatments.'),
       ('Satin Pothos', 'Scindapsus pictus', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings. Prefers humidity.'),
       ('Golden Pothos', 'Epipremnum aureum', 'Low to bright indirect light', 'Weekly', 'Monthly',
        'Tolerates low light and irregular watering.'),
       ('Philodendron', 'Philodendron "Imperial Green"', 'Bright indirect light', 'Weekly', 'Monthly',
        'Allow soil to dry between waterings. Prefers humidity.')
    ON DUPLICATE KEY UPDATE light     = VALUES(light),
    water     = VALUES(water),
                         fertilize = VALUES(fertilize),
                         notes     = VALUES(notes);

-- Insert initial data into users table
INSERT INTO users (name)
VALUES ('Cleoclatra'),
       ('Waffle Bot'),
       ('Pookey Bear'),
       ('Tootsie Roll')
    ON DUPLICATE KEY UPDATE name = VALUES(name);

-- Insert initial data into user_plants table
INSERT INTO user_plants (user_plant_name, user_id, plant_id)
VALUES ('Dumpling', 1, 1),
       ('Pickle', 2, 2),
       ('Spice', 3, 3),
       ('Boo', 4, 4),
       ('Fluffy', 1, 5),
       ('Girly', 2, 1)
    ON DUPLICATE KEY UPDATE user_plant_name = VALUES(user_plant_name);

-- Insert initial data into watering_schedule table
INSERT INTO watering_schedule (last_watering, next_watering, user_plant_id)
VALUES ('2024-07-01', '2024-07-08', 1),
       ('2024-07-02', '2024-07-09', 2),
       ('2024-07-03', '2024-07-10', 3),
       ('2024-07-04', '2024-07-11', 4),
       ('2024-07-05', '2024-07-12', 5),
       ('2024-07-06', '2024-07-13', 6)
    ON DUPLICATE KEY UPDATE last_watering = VALUES(last_watering),
    next_watering = VALUES(next_watering);