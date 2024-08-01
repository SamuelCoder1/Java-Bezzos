CREATE DATABASE aerolinea;

use aerolinea;

create table avion(
	id_avion int primary key auto_increment,
    modelo varchar(50),
    capacidad int
);

create table vuelo(
	id_vuelo int primary key auto_increment,
    destino varchar(50),
    fecha_salida date,
    hora_salida datetime,
    id_avion int,
    foreign key (id_avion) references avion(id_avion)
);

create table pasajero(
	id_pasajero int primary key auto_increment,
    nombre varchar(100),
    apellido varchar(100),
    documento_identidad varchar(20)
);

create table reservacion(
	id_reservacion int primary key auto_increment,
    fecha_reservacion date,
    asiento varchar(10),
    id_pasajero int,
    id_vuelo int,
    foreign key (id_pasajero) references pasajero(id_pasajero),
    foreign key (id_vuelo) references vuelo(id_vuelo)
);


