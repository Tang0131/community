create table question
(
    id int auto_increment,
    title varchar(50) null,
    description text null,
    gmt_create bigint null,
    gmt_modified int null,
    creator int null,
    comment_count int null,
    view_count int null,
    like_count int null,
    tag varchar(256) null,
    constraint question_pk
        primary key (id)
);

