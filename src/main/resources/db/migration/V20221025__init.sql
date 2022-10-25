create table jurusan(
    id varchar(36),
    name varchar(100) not null,
    primary key (id)
);

create table siswa(
    id varchar(36),
    name varchar(100) not null,
    id_jurusan varchar(36),
    primary key (id)
);