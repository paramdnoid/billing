CREATE TABLE t_payment (
  id      serial PRIMARY KEY,
  date    date NOT NULL,
  code    text NOT NULL,
  comment text NOT NULL
);