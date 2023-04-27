create table products
(
    id          serial,
    name        varchar not null,
    description varchar,
    picture     varchar,
    price       int
);

create unique index products_id_uindex
    on products (id);

alter table products
    add constraint products_pk
        primary key (id);
