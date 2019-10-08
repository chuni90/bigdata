-- 테이블 제거
DROP TABLE student;

-- 테이블 생성
CREATE TABLE student (
	id varchar2(10) PRIMARY KEY,
	name varchar2(20) NOT NULL,
	kor number default 0,
	eng number default 0,
	math number default 0
);

-- row insert
INSERT INTO student values ('a1234', 'aaa', 100, 80, 90);
INSERT INTO student values ('a2345', 'bbb', 88, 95, 74);
INSERT INTO student values ('a3456', 'ccc', 20, 40, 60);


-- 작업 검증
SELECT * FROM student WHERE ROWNUM <2;

--delete 테스트
DELETE student where name = 'bbb';