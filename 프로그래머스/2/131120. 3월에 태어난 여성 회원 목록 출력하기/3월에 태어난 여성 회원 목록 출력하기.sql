-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, to_char(DATE_OF_BIRTH,'YYYY-MM-DD') AS DATE_OF_BIRTH
FROM member_profile
WHERE to_char(date_of_birth,'MM')='03' AND NOT TLNO IS NULL AND GENDER='W'
ORDER BY member_id asc;