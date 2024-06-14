USE poec_bdx_jwt;

INSERT INTO staged (id) VALUES (1);
INSERT INTO staged (id) VALUES (2);

INSERT INTO user (staged_id, points, email, firstname, lastname, username) VALUES (1, 700, "admin@admin.com", "admin", "admin", "admin");
INSERT INTO user (staged_id, points, email, firstname, lastname, username) VALUES (2, 1234, "user1@user1.com", "user", "user", "user");


INSERT INTO brand (logo, title) values ("static/images/logo/carrefour.png", "Carrefour");
INSERT INTO brand (logo, title) values ("static/images/logo/monoprix.png", "Monoprix");
INSERT INTO brand (logo, title) values ("static/images/logo/free.png", "Free");



INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 20, 100, 1, "2024-12-31", "2024-01-01", "FFFFFF", "A bottle of coke", "Coke", "Coke");
INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 22, 100, 1, "2024-12-30", "2024-01-01", "FFFFFF", "A bottle of coke", "bisquits", "bisquits");
INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 27, 100, 1, "2024-12-29", "2024-01-01", "FFFFFF", "A paquet de cacahuète", "cacahuète", "cacahuète");
INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 15, 100, 2, "2024-12-28", "2024-01-01", "FFFFFF", "A bouteille de vin rouge", "Vin", "Vin");
INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 26, 100, 2, "2024-12-27", "2024-01-01", "FFFFFF", "A bottle of coke", "Coke", "Coke");
INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 10, 100, 2, "2024-12-26", "2024-01-01", "FFFFFF", "A bottle of coke", "Coke", "Coke");
INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 33, 100, 3, "2024-12-25", "2024-01-01", "FFFFFF", "A nouvelle telephone", "iPhone", "iPhine ");
INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 44, 100, 3, "2024-12-24", "2024-01-01", "FFFFFF", "6 mois de wifi", "wifi", "6 mois de wifi");
INSERT INTO promos(amount, percent_off, price, brand_id, end_date, start_date, color, description, item, title) VALUES (1000, 55, 100, 3, "2024-12-23", "2024-01-01", "FFFFFF", "1 anne de Netflix", "Netflix", "Netflix");




INSERT INTO type (points, description, name, pictogram) VALUES ("100", "Depot de Verre", "Verre", "static/images/waste/un-verre.png");
INSERT INTO type (points, description, name, pictogram) VALUES ("50", "Depot de Parfum", "Parfum", "static/images/waste/parfum.svg");
INSERT INTO type (points, description, name, pictogram) VALUES ("1000", "Depot de iPhone", "iPhone", "static/images/waste/iPhone.png");
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
INSERT INTO bin (type_id, bin_name, localisation) VALUES (2, null, "44.869335,-0.565646");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (4, null, "44.869335,-0.565646");
INSERT INTO bin (type_id, bin_name, localisation) VALUES (5, null, "44.869335,-0.565646");
--INSERT INTO bin (type_id, bin_name, localisation) VALUES (6, null, "44.869335,-0.565646");



INSERT INTO rubbish (is_depot, type_id) VALUES (false, 1);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 1);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 1);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 3);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 3);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 4);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 5);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 6);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 3);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 2);
INSERT INTO rubbish (is_depot, type_id) VALUES (false, 4);
--INSERT INTO rubbish (is_depot, type_id) VALUES (true, 7);
--INSERT INTO rubbish (is_depot, type_id) VALUES (true, 7);



INSERT INTO deposit (bin_id, rubbish_id, user_id, scan_data) VALUES (1, 1, 2, "{id: 1}");
INSERT INTO deposit (bin_id, rubbish_id, user_id, scan_data) VALUES (1, 2, 2, "{id: 2}");


INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (4,2);
INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (7,2);
INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (9,2);
INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (3,2);
INSERT INTO staged_rubbish (rubbish_id, staged_id) VALUES (10,2);


INSERT INTO user_promos (is_redeemed, is_purchased, promos_id, user_id) VALUES (false, false, 1, 2);
INSERT INTO user_promos (is_redeemed,  is_purchased,  promos_id, user_id) VALUES (true, false, 2, 2);
INSERT INTO user_promos (is_redeemed, is_purchased, promos_id, user_id) VALUES (false, false, 1, 2);
