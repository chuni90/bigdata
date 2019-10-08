SELECT * FROM MEMBER;

DROP table member;

CREATE table member (
	id varchar2(20) PRIMARY key,
	pass number NOT NULL,
	name varchar2(20) NOT NULL,
	age number,
	phone char(13)
);

INSERT INTO member values ('AAA', 1234, 'hong',11 ,'010-1111-1111');
INSERT INTO member values ('BBB', 1234, 'kang',22 ,'010-2222-2222');