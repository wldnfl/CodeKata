-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE intake_condition != 'Aged'
ORDER BY ANIMAL_ID

-- WHERE intake_condition != 'Aged'
-- WHERE intake_condition NOT IN ('Aged')
-- WHERE NOT intake_condition = 'Aged'