/* When Passport is the owner */
/*
INSERT INTO employee VALUES(101, 'Yash');
INSERT INTO employee VALUES(102, 'Ankit');
INSERT INTO employee VALUES(103, 'Shreya');

INSERT INTO passport VALUES(305, 'IND1234', 101);
INSERT INTO passport VALUES(307, 'IND2345', 103);
*/

INSERT INTO passport VALUES(305, 'IND1234');
INSERT INTO passport VALUES(307, 'IND2345');

INSERT INTO employee VALUES(101, 'Yash', 307);
INSERT INTO employee VALUES(102, 'Ankit', 305);

