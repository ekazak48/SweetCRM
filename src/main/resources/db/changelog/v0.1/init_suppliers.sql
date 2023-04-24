create table suppliers
(
    id      serial,
    name    varchar,
    address varchar,
    phone   varchar,
    email   varchar,
    website varchar
);

create unique index suppliers_id_uindex
    on suppliers (id);

alter table suppliers
    add constraint suppliers_pk
        primary key (id);
