CREATE TABLE STUDENT(
    ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255),
    GRADE INTEGER,
    LETTER_GRADE VARCHAR(2),
    ATTENDED BIT,
    PARTICIPATED BIT
);