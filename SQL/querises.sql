SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status = 'Not destroyed';
SELECT * FROM jaegers WHERE mark = '2' OR mark = '3';
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT * FROM jaegers WHERE mark = (SELECT MIN(mark) from jaegers);
SELECT * FROM jaegers WHERE kaijukill = (SELECT MIN(kaijukill) from jaegers);
SELECT * FROM jaegers WHERE kaijukill = (SELECT MAX(kaijukill) from jaegers);
SELECT AVG(weight) FROM jaegers;
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE status = 'Not destroyed';
DELETE FROM jaegers WHERE status = 'destroyed';


































































