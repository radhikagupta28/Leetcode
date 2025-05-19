# Write your MySQL query statement below
SELECT name FROM EMPLOYEE
WHERE id IN
(SELECT managerId FROM EMPLOYEE 
    GROUP BY managerId HAVING COUNT(*)>=5
);