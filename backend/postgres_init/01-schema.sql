
create table "users" (
    "id" serial primary key,
    "username" varchar(64) not null unique,
    "password" varchar(512) not null,
    "created_at" timestamptz not null default current_timestamp,
    "updated_at" timestamptz not null default current_timestamp,
    "balance" numeric(10, 2) not null default 0
);