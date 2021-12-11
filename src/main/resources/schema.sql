DROP TABLE IF EXISTS conference;

CREATE TABLE conference (
  id VARCHAR(5) NOT NULL
);


DROP TABLE IF EXISTS team;

CREATE TABLE team (
  id VARCHAR(4) NOT NULL, 
  locale VARCHAR(50) NOT NULL, 
  name VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS conference_team;

CREATE TABLE conference_team (
  confid VARCHAR(5) NOT NULL, 
  teamid VARCHAR(4) NOT NULL
);





DROP TABLE IF EXISTS player;

CREATE TABLE player (
  id VARCHAR(10) NOT NULL, 
  firsName VARCHAR(250) NOT NULL, 
  lastName VARCHAR(250) NOT NULL,
  position VARCHAR(5) NOT NULL
);
