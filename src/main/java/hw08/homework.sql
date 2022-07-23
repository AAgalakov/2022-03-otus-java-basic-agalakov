CREATE TABLE question
(
    id   SERIAL PRIMARY KEY,
    text VARCHAR(1024)
);

CREATE TABLE answer
(
    id          SERIAL PRIMARY KEY,
    text        VARCHAR(1024),
    question_id INTEGER REFERENCES question (id),
    correct     BOOLEAN
);

INSERT INTO question (text)
VALUES ('Первый вопрос'),
       ('Второй вопрос'),
       ('Третий вопрос');

INSERT INTO answer(text, question_id, correct)
VALUES ('Верный ответ на первый вопрос', 1, true),
       ('Неверный ответ на первый вопрос', 1, false),
       ('Неверный ответ на первый вопрос', 1, false),
       ('Неверный ответ на второй вопрос', 2, false),
       ('Верный ответ на второй вопрос', 2, true),
       ('Неверный ответ на второй вопрос', 2, false),
       ('Неверный ответ на третий вопрос', 3, false),
       ('Неверный ответ на третий вопрос', 3, false),
       ('Верный ответ на третий вопрос', 3, true);
