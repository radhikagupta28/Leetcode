# Write your MySQL query statement below
SELECT user_id,COUNT(*) AS followers_count
from Followers
GROUP BY user_id
ORDER BY user_id;