select * from tab;

select * from employee;

DESC department

SELECT * FROM department;

-- SELECT �ʵ��� FROM ���̺�� WHERE ���ǽ�;

-- ��� ���̺��� �����ȣ, ����̸�, ����, �μ���ȣ�� �����Ͻÿ�.
SELECT eno, ename, job, dno FROM employee;


-- ��� ���̺��� �޿��� 1,000$ �̻��� ����� �����ȣ, ����̸�, ������ �����Ͻÿ�
SELECT eno, ename, job, salary FROM employee WHERE salary >= 1000;


-- ������̺��� �μ���ȣ�� 20���� �ش��ϴ� ����� �����ȣ, �̸�, ����, �μ���ȣ�� �����Ͻÿ�.
Select eno, ename, job, dno
FROm employee
WHERE dno = 20;


-- ������̺��� �μ���ȣ�� 20�� or 30���� �ش��ϴ� ����� ���, �̸�, ����, �μ���ȣ ����
SELECT eno, ename, job, dno
FROM employee
WHERE dno = 20
OR dno = 30;


-- ������̺��� �Ի�⵵�� 1980�⵵�� ����� ���, �̸�, ����, �Ի����� �����Ͻÿ�.
-- ��¥�� ���ڿ��� �ν��ϹǷ� ����ǥ�� ���ؼ� ����� �Ѵ�. 
SELECT eno, ename, job, hiredate
FROM employee
WHERE hiredate >= '1981-02-01' and hiredate <= '1981-02-28';


-- ������̺��� �޿��� 1000���� 1500 ���̿� �ش��ϴ� ������ �����ȣ,�̸�, ����, �޿��� �����Ͻÿ�. 
-- ���� ������ between���� �ս��� �����ϴ�.
SELECT eno, ename, job, salary
from employee
WHERE salary between 1000 and 1500;


-- ������̺��� �޿��� 2000�̸��̰ų� 3000 �ʰ��� �ش��ϴ� ������ �����ȣ,�̸�, ����, �޿��� �����Ͻÿ�. 
SELECT eno, ename, job, salary
FROM employee
WHERE salary > 3000 
OR salary < 2000;


-- Ŀ�̼��� 300 Ȥ�� 500Ȥ�� 1400�� ����� �ִ��� �˻��ϴ� ������
-- in('a', 'b', 'c') �� �����Ǹ� �Ұ�ȣ �ȿ� �˻��� ���� dtype�� �°� ������ ��.
SELECT commission FROM employee WHERE commission in(300, 500, 1400);
SELECT commission FROM employee WHERE commission not in(300, 500);


-- LIKE ������ : �÷��� ����� �������� ���� ��ġ�� �����Ͱ� ��ġ�ϸ� ��ȸ�� ������ �������̴�.
-- '%��%'  : ������ �����ϴ�, ������ ������, ���� �߰��� �ִ�, �� ���� '����'�϶�� �ǹ���.

-- SMITH�̸��� ���� ����� ���� ������ ����
SELECT * FROM employee WHERE ename NOT LIKE '%S';

-- _(�����)�� 1���� 1���ڸ� �ǹ���.
SELECT * FROM employee WHERE ename LIKE '____S';

-- commission�� null�� ������ ���� ������ �����Ͻÿ�.
SELECT * FROM employee WHERE commission is not null;


-- �ӽ����̺��� dual �̶�� ���
-- �� dual�� �ܼ� ���, ����, ǥ�� ���� �ϴµ� ����� �� ����
-- ���� �ý��ۿ� ��ϵ� �ð��� Ȯ���ϴ� ���
select sysdate from dual;

