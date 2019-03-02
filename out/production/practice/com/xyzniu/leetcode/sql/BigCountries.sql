# Write your MySQL query statement below
# 如果一个国家的面积超过300万平方公里. 或者人口超过2500万. 那么这个国家就是大国家.
# 编写一个SQL查询. 输出表中所有大国家的名称. 人口和面积.
SELECT name, population, area FROM World WHERE area>3000000 OR population> 25000000;