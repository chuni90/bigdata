DROP TABLE movie;

CREATE table movie (
	id number PRIMARY KEY,
	title varchar2(20) NOT NULL,
	country varchar2(20) NOT NULL,
	release varchar2(20) default '0000.00.00',
	director varchar2(20));
	
INSERT INTO movie values (1, 'EXIT', 'KOR', '2019.08.01', '½ÂÇö');
INSERT INTO movie values (2, 'Avengers', 'USA', '2011.05.11', 'Á¤¹Î');
INSERT INTO movie values (3, 'Inception', 'USA', '2015.11.12', 'Àººñ');

SELECT * FROM movie;

-- account
DROP TABLE account;
CREATE TABLE account(
	id varchar2(10) PRIMARY KEY,
	name varchar2(20) NOT NULL,
	mymovie varchar2(20) default 0,
	power varchar2(2) default 0);
	
INSERT INTO account (id, name) values ('aaa', 'Mr.a');
INSERT INTO account (id, name) values ('bbb', 'Mr.b');
INSERT INTO account (id, name) values ('ccc', 'Ms.c');
INSERT INTO account (id, name, power) values ('admin', 'admin',1);

UPDATE ACCOUNT set mymovie = '2' WHERE id = 'bbb';
UPDATE ACCOUNT set mymovie = '2' WHERE id = 'ccc';

SELECT * FROM account;

SELECT m.id, m.title, COUNT(a.mymovie) as vote_count
FROM movie m, account a
WHERE m.id = a.mymovie
GROUP BY m.id, m.title;


-- seat table »ý¼ºÇÏ±â
CREATE TABLE seat (
    seat_id varchar2(20) PRIMARY KEY,
    status varchar2(3) default 0,
    user_id varchar2(20));
    
INSERT INTO seat values ('1-1', '0', '');
INSERT INTO seat values ('1-2', '0', '');
INSERT INTO seat values ('1-3', '0', '');
INSERT INTO seat values ('1-4', '0', '');
INSERT INTO seat values ('1-5', '1', '');

UPDATE seat SET user_id = 'aaa' WHERE seat_id = '1-5';
UPDATE seat SET status = '1', user_id = 'bbb' WHERE seat_id = '1-3';

SELECT * FROM seat;