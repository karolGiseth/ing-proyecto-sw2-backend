drop schema if exists bd_proyecto_anotador;
create schema bd_proyecto_anotador;
use bd_proyecto_anotador;


create table if not exists imagen (
	id int (2) primary key auto_increment not null, 
	url varchar (350) not null,
    categoria varchar (50),
    titulo varchar (50),
    descripcion varchar (50)
);

create table if not exists tipo_usuario (
	id int (2) not null,
    rol varchar(15) not null,
    primary	key id (id)
);

create table if not exists usuario (
	id int (2) primary key auto_increment not null,
    nombre varchar(45) not null,
    id_tipo int (2) not null,
    id_imagen int (2) not null,
    KEY id_tipo (id_tipo),
    constraint `usuario_ibfk_1` foreign key (id_tipo) references tipo_usuario (id),
    KEY id_imagen (id_imagen),
    constraint usuario_ibfk_2 foreign key (id_imagen) references imagen (id)
);

create table if not exists sesion (
	id int (20) primary key auto_increment not null,
    nombre_usuario varchar(50) not null,
    contraseña varchar(50) not null,
    id_usuario int (2) not null,
    KEY id_usuario (id_usuario),
    CONSTRAINT `sesion_ibfk_1` FOREIGN KEY (id_usuario) REFERENCES `usuario` (`id`)
);