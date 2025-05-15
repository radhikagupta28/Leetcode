# Write your MySQL query statement below
select uni.unique_id , em.name 
from Employees em
left join EmployeeUNI uni on
em.id=uni.id;