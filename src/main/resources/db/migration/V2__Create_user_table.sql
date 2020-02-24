create table user
(
    id           int auto_increment primary key,
    name         varchar(255) null,
    account_id   varchar(255) null,
    token        varchar(255) null,
    gmt_create   bigint(255)  null,
    gmt_modified bigint(255)  null
);