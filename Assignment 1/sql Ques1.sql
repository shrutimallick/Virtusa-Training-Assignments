CREATE TABLE SUBJECT (
    id INT,
    rollno INT,
    subjectname VARCHAR(10),
    marks INT
);

SELECT * FROM SUBJECT;

INSERT INTO SUBJECT VALUES (1,1941012832,'chem',95),
			   (2,1941012833,'phy',87),
			   (3,1941012834,'bio',89),
			   (4,1941012835,'eng',90);


SELECT COUNT(id)
FROM SUBJECT
WHERE subjectname='chem';

SELECT SUM(marks)
FROM SUBJECT
WHERE rollno=1941012835;
