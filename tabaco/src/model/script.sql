create database BD_Tabaco;

use BD_Tabaco;

create table tipoF(
    id int auto_increment,
    nombre varchar(20),
    primary key (id)
);

insert into tipo values(null, menta);
insert into tipo values(null, normal);

create table tipoP(
    id int auto_increment,
    nombre varchar(20),
    sabor varvhar(50),
    primary key (id)
);

insert into tipoP values(null, 'OCB', 'vainilla');
insert into tipoP values(null, 'pay pay', 'normal');

create table tipoT(
    id int auto_increment,
    nombre varchar(20),
    sabor varvhar(50),
    primary key (id)
);

insert into tipoT values(null, 'tabaco algo', 'chocolate');
insert into tipoT values(null, 'algo', 'menta');

create table producto(
    id int auto_increment,
    tipoT int,
    tipoP int,
    tipoF int,
    precio int,
    foreign key(tipoT) references tipoT(id),
    foreign key(tipoP) references tipoP(id),
    foreign key(tipoF) references tipoF(id),
    primary key (id)
);