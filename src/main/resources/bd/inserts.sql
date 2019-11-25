use bd_proyecto_anotador;

insert into tipo_usuario values (1, 'anotador');
insert into tipo_usuario values (2, 'cliente');

insert into usuario values (1, 'karol', 1);
insert into usuario values (2, 'carlos', 2);
insert into usuario values (3, 'laura', 2);
insert into usuario values (4, 'jose', 2);

insert into imagen values (1, 'https://www.pruebaderuta.com/wp-content/uploads/2016/03/corvette-encabezado-620x264.jpg', 'deportivo', 'Porsche Carrera', 'carro deportivo de carreras', 2);
insert into imagen values (2, 'https://www.pruebaderuta.com/wp-content/uploads/2016/03/carrera.jpg', 'clasico', 'Chevrolet Corvette', 'carro deportivo de carreras', 2);
insert into imagen values (3, 'https://www.pruebaderuta.com/wp-content/uploads/2016/03/viper.jpg', 'antiguo', 'Dodge Viper', 'carro deportivo de carreras', 3);
insert into imagen values (4, 'https://www.pruebaderuta.com/wp-content/uploads/2016/03/cobra.jpg', 'exotico', 'Shelby Cobra', 'carro deportivo de carreras', 4);

insert into sesion values (1,'Karol', 'sw2proyecto', 1);
insert into sesion values (2,'carlos', 'colombia2', 2);
insert into sesion values (3,'laura', 'colombia3', 3);
insert into sesion values (4,'jose', 'colombia4', 4);