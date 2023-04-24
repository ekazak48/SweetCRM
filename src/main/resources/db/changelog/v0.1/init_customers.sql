create table customers
(
    id    serial,
    name  varchar not null,
    email varchar,
    phone varchar
);

comment on table customers is 'table for saving customers information';

create unique index customers_id_uindex
    on customers (id);

alter table customers
    add constraint customers_pk
        primary key (id);