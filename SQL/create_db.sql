

CREATE TABLE jaegers (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark 	  INTEGER,
	height 	  INTEGER,
	weight 	  INTEGER,
	status 	  TEXT,
	origin    TEXT,
	launch    CHAR(1),
	kaijuKill INTEGER
);