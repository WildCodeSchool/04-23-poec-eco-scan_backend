USE poec_bdx_jwt;

INSERT INTO staged (id) VALUES (1);
INSERT INTO staged (id) VALUES (2);

INSERT INTO user (staged_id, points, email, firstname, lastname, username, image_path) VALUES (1, 700, "admin@admin.com", "admin", "admin", "admin", "static/images/avatar/profil.png" );
INSERT INTO user (staged_id, points, email, firstname, lastname, username, image_path) VALUES (2, 1234, "user1@user1.com", "user", "user", "user", "static/images/avatar/profil.png");


-- Inserts pour les marques
INSERT INTO brand (logo, title) VALUES ("static/images/logo/carrefour.png", "Carrefour");
INSERT INTO brand (logo, title) VALUES ("static/images/logo/monoprix.png", "Monoprix");
INSERT INTO brand (logo, title) VALUES ("static/images/logo/free.png", "Free");
INSERT INTO brand (logo, title) VALUES ("static/images/logo/leclerc.png", "Leclerc");
INSERT INTO brand (logo, title) VALUES ("static/images/logo/fnac.png", "Fnac");
INSERT INTO brand (logo, title) VALUES ("static/images/logo/orange.png", "Orange");
INSERT INTO brand (logo, title) VALUES ("static/images/logo/sephora.png", "Sephora");
INSERT INTO brand (logo, title) VALUES ("static/images/logo/hm.png", "H&M");


-- Carrefour promotions
INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (500, 20, 50, 1, "2024-12-31", "2024-06-01", "f1ece3", "Une bouteille de Coca-Cola", "Coca-Cola", "Coca-Cola 1L");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (300, 25, 80, 1, "2024-11-30", "2024-06-15", "d5e0db", "Un paquet de biscuits Granola", "Biscuits", "Granola Biscuits");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (200, 30, 70, 1, "2024-10-29", "2024-07-01", "84baa0", "Un paquet de cacahuètes Ben & Hut", "Cacahuètes", "Ben & Hut Cacahuètes");

-- Monoprix promotions
INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (400, 15, 90, 2, "2024-12-15", "2024-06-20", "f1ece3", "Une bouteille de vin rouge", "Vin", "Vin Rouge Bordeaux");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (250, 20, 60, 2, "2024-12-20", "2024-07-01", "d5e0db", "Une bouteille de Coca-Cola", "Coca-Cola", "Coca-Cola 1.5L");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (150, 25, 70, 2, "2024-11-30", "2024-08-10", "84baa0", "Un téléphone portable basique", "Téléphone", "Téléphone Portable");

-- Free promotions
INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (300, 30, 50, 3, "2024-12-25", "2024-06-25", "f1ece3", "Un paquet de pâtes Barilla", "Pâtes", "Pâtes Barilla");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (200, 35, 40, 3, "2024-12-30", "2024-07-01", "d5e0db", "Un paquet de riz Taureau Ailé", "Riz", "Riz Taureau Ailé");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (100, 40, 60, 3, "2024-12-15", "2024-08-01", "84baa0", "Une boîte de thon Petit Navire", "Thon", "Thon Petit Navire");

-- Leclerc promotions
INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (350, 35, 80, 4, "2024-12-22", "2024-06-30", "f1ece3", "Un micro-ondes Samsung", "Micro-ondes", "Micro-ondes Samsung");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (250, 40, 100, 4, "2024-12-20", "2024-07-05", "d5e0db", "Un aspirateur Dyson", "Aspirateur", "Aspirateur Dyson");

-- Darty promotions
INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (150, 45, 120, 5, "2024-12-20", "2024-07-10", "84baa0", "Une télévision LG", "Télévision", "Télévision LG");

-- Orange promotions
INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (200, 50, 70, 6, "2024-12-19", "2024-06-15", "f1ece3", "Un forfait mobile 50 Go", "Forfait", "Forfait 50 Go");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (100, 55, 60, 6, "2024-12-18", "2024-07-01", "d5e0db", "Un abonnement internet fibre optique", "Internet", "Fibre Optique");

INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (50, 60, 80, 6, "2024-12-17", "2024-07-15", "84baa0", "Un abonnement TV Canal+", "TV", "Abonnement Canal+");

-- Ajout d'une promotion supplémentaire pour Orange
INSERT INTO promos (amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title)
VALUES (300, 65, 90, 6, "2024-12-16", "2024-07-20", "f1ece3", "Un téléphone iPhone", "iPhone", "iPhone 12");






INSERT INTO type (points, description, name, pictogram) VALUES ("100", "Depot de Verre", "Verre", "static/images/waste/un-verre.svg");
INSERT INTO type (points, description, name, pictogram) VALUES ("50", "Depot de Parfum", "Parfum", "static/images/waste/parfum.svg");
INSERT INTO type (points, description, name, pictogram) VALUES ("1000", "Depot de iPhone", "iPhone", "static/images/waste/iPhone.svg");
INSERT INTO type (points, description, name, pictogram) VALUES ("30", "Cartouche d'encre", "Encre", "static/images/waste/encre.svg");
INSERT INTO type (points, description, name, pictogram) VALUES ("60", "Depot de Cosmetic", "Cosmetic", "static/images/waste/cosmetic.svg");
INSERT INTO type (points, description, name, pictogram) VALUES ("90", "Depot de Batterie", "Batterie", "static/images/waste/batterie.svg");



INSERT INTO bin (type_id, bin_name, localisation) VALUES (1, null, "44.8690178,-0.5683332");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (2, null, "44.837789, -0.57918");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (2, null, "44.844297, -0.573723");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (4, null, "44.856579, -0.560116");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (5, null, "44.863788, -0.563141");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (6, null, "44.841225, -0.56728");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (1, null, "44.848253, -0.570541");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (2, null, "44.838889, -0.570335");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (5, null, "44.84263, -0.575305");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (4, null, "44.850527, -0.576736");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (5, null, "44.856175, -0.565345");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (6, null, "44.843622, -0.571979");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (3, "Free Telephones", "44.672922, -0.558372");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (3, "Free Telephones", "44.843622, -0.571979");


--wild code school bins
INSERT INTO bin (type_id, bin_name, localisation) VALUES (1, null, "44.869335,-0.565646");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (2, null, "44.869335,-0.565646");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (3, null, "44.869335,-0.565646");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (4, null, "44.869335,-0.565646");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (5, null, "44.869335,-0.565646");
--INSERT INTO bin (type_id, bin_name, localisation) VALUES (6, null, "44.869335,-0.565646");



INSERT INTO rubbish (is_depot, type_id) VALUES (false, 1); --deposited 1
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 1); --deposited 2
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 1); --staged    3
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2); --staged    4
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2); --          5
INSERT INTO rubbish (is_depot, type_id) VALUES (true, 3); --          6
--INSERT INTO rubbish (is_depot, type_id) VALUES (false, 3); --staged    7
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 4); --          8
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 5); --staged    9
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 6); --staged   10
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2); --         11
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2); --         12
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2); --         13
--INSERT INTO rubbish (is_depot, type_id) VALUES (false, 3); --         14
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2); --         15
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 4); --         16
--INSERT INTO rubbish (is_depot, type_id) VALUES (true, 7);  --         17
--INSERT INTO rubbish (is_depot, type_id) VALUES (true, 7);  --         18



INSERT INTO deposit (bin_id, rubbish_id, user_id, scan_data) VALUES (1, 1, 2, "{id: 1}");
INSERT INTO deposit (bin_id, rubbish_id, user_id, scan_data) VALUES (1, 2, 2, "{id: 2}");


INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (4,2);
--INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (7,2);
INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (9,2);
INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (3,2);
INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (10,2);


INSERT INTO user_promos (is_redeemed, is_purchased, promos_id, user_id) VALUES (false, false, 1, 2);
INSERT INTO user_promos (is_redeemed,  is_purchased,  promos_id, user_id) VALUES (true, false, 2, 2);
INSERT INTO user_promos (is_redeemed, is_purchased, promos_id, user_id) VALUES (false, false, 1, 2);
