CREATE TABLE board (
    board_id NUMBER(4) CONSTRAINT board_id_pk PRIMARY KEY,
    writer_id VARCHAR2(15),
    writer_pw VARCHAR2(30),
    write_title VARCHAR2(100),
    write_content VARCHAR2(2000),
    write_date DATE,
    write_view NUMBER(9),
    write_recommend NUMBER(9),
    write_not_recommend NUMBER(9)
);


CREATE SEQUENCE board_id_seq;

ALTER SEQUENCE board_id_seq NOCACHE;

select * from board order by board_id;

INSERT INTO board VALUES (board_id_seq.NEXTVAL, 
    'test1', '1234', '하이~!!', '반갑습니다', sysdate, 0, 0, 0);

delete from board where write_title is null;    
purge recyclebin;
COMMIT;

UPDATE board SET writer_id='test2', write_title='테스트', write_content='테스트입니다.'  WHERE board_id=12;
