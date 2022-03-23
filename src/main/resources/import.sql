create table MESSAGE
(
    ID   bigint identity primary key,
    TEXT nvarchar(256)
);

insert into MESSAGE (TEXT)
VALUES ('Hello'),
       ('World');