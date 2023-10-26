CREATE TABLE Order (
	id VARCHAR(255),	-- added default type
	attr1 VARCHAR(255),	-- added default type
	PRIMARY KEY (id)
);
CREATE TABLE B (
	id VARCHAR(255),	-- added default type
	PRIMARY KEY (id)
);
CREATE TABLE Rel (
	id VARCHAR(255),	-- added default type
	id2 VARCHAR(255),	-- renamed from: id; added default type
	PRIMARY KEY (id, id2),
	FOREIGN KEY (id) REFERENCES Order (id) ON DELETE CASCADE,
	FOREIGN KEY (id2) REFERENCES B (id) ON DELETE CASCADE
);