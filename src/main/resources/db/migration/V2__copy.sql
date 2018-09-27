LOAD DATA LOCAL INFILE '/home/alexei/Documents/Codes/Olympic_history/Olympic\ history/athlete_eventsV2.csv'
INTO TABLE athletes
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;