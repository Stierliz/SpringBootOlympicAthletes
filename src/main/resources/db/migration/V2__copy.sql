LOAD DATA LOCAL INFILE '/home/alexei/Downloads/120-years-of-olympic-history-athletes-and-results/athlete_eventsV2.csv'
INTO TABLE athletes
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 ROWS;