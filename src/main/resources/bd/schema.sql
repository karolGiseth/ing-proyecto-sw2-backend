drop schema if exists bd_proyecto_anotador;
create schema bd_proyecto_anotador;
use bd_proyecto_anotador;

create table if not exists tipo_usuario (
	id int (2) not null,
    rol varchar(15) not null,
    primary	key id (id)
);

create table if not exists usuario (
	id int (2) primary key auto_increment not null,
    nombre varchar(45) not null,
    id_tipo int (2) not null,
    KEY id_tipo (id_tipo),
    constraint `usuario_ibfk_1` foreign key (id_tipo) references tipo_usuario (id)
);

create table if not exists imagen (
	id int (2) primary key auto_increment not null, 
	url varchar (2000) not null,
    categoria varchar (150),
    titulo varchar (150),
    descripcion varchar (150),
    id_usuario int (2) not null,
    KEY id_usuario (id_usuario),
    constraint imagen_ibfk_1 foreign key (id_usuario) references usuario (id)
);

create table if not exists sesion (
	id int (20) primary key auto_increment not null,
    nombre_usuario varchar(50) not null,
    contraseña varchar(50) not null,
    id_usuario int (2) not null,
    KEY id_usuario (id_usuario),
    CONSTRAINT `sesion_ibfk_1` FOREIGN KEY (id_usuario) REFERENCES `usuario` (`id`)
);