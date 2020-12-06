
INSERT INTO tb_tipo_moneda (cod_tipo,nombre) VALUES ('1', 'Soles');
INSERT INTO tb_tipo_moneda (cod_tipo,nombre) VALUES ('2', 'Dolares');

INSERT INTO tb_clientes VALUES ('1', 'Polo', 'Ruiz', 'polor@gmail.com', '72585966', 'Lorena');
INSERT INTO tb_clientes VALUES ('2', 'Paredes', 'Mena', 'menap@gmail.com', '09069745', 'Jorge');

INSERT INTO tb_cuentas_bancarias VALUES ('1', '00110130020200365896', '5000', '4551708289685452', '1', '1');
INSERT INTO tb_cuentas_bancarias VALUES ('2', '0054060020000154855', '7500', '4551726514875212', '2', '2');
INSERT INTO tb_cuentas_bancarias VALUES ('2', '00062530020000154815', '4500', '4551708362514785', '3', '2');
INSERT INTO tb_cuentas_bancarias VALUES ('2', '00250430020000426558', '2580', '4551708598547521', '4', '2');

insert into tb_tipo_transaccion values ( 1, "Transferencia");
insert into tb_tipo_transaccion values ( 2, "Pago de servicio");

insert into tb_tipo_notificaciones values ( 1, "Campaña");
insert into tb_tipo_notificaciones values ( 2, "Transaccion");

INSERT INTO tb_usuarios values (1, 'Castillo', 'Roa', 'roasgo@hotmail.com', '74917841', 'Gonzalo', 'cibertec');
INSERT INTO tb_usuarios values (2, 'Castillo', 'Roa', 'roasgo@hotmail.com', '74917841', 'Rodrigo', 'cibertec');
INSERT INTO tb_usuarios values (3, 'Luyo', 'Ayala', 'arturo3000@hotmail.com', '7412354', 'Arturo', 'usil');
INSERT INTO tb_usuarios values (4, 'Navarrete', 'Dardanet', 'axel123@outlook.com', '85968448', 'Axel', 'universidad');
INSERT INTO tb_campanas (cod_camp, titulo, descripcion, fech_fin, fech_ini, fecha, hora, cod_usu_cod_usu) values (1, 'Cuenta Ganadora','Abre tu cuenta ganadora y participa por el carro del año','2000-07-07','2000-07-07','2000-07-07','7:00',1);

insert into tb_transacciones values ( 1, 2, 'Esta es una descripcion de prueba', '2020-12-02', '12:00', 500.00, 1, 1);
insert into tb_transacciones values ( 2, 1, 'Esta es una descripcion de prueba', '2020-12-02', '10:00', 450.00, 3, 1);
insert into tb_transacciones values ( 3, 4, 'Esta es una descripcion de prueba', '2020-12-02', '10:00', 50.00, 2, 1);
insert into tb_transacciones values ( 4, 3, 'Esta es una descripcion de prueba', '2020-12-02', '11:00', 620.00, 4, 1);
insert into tb_transacciones values ( 5, 2, 'Esta es una descripcion de prueba', '2020-12-02', '13:00', 70.00, 3, 1);
insert into tb_transacciones values ( 6, 3, 'Esta es una descripcion de prueba', '2020-12-02', '14:00', 80.00, 2, 1);

insert into tb_notificaciones values ( 1, 'Esta es otra descripcion de prueba', 0, '2020-12-12', '15:00', 'Transferencia realizada con exito', 2);
insert into tb_notificaciones values ( 2, 'Esta es otra descripcion de prueba', 0, '2020-12-12', '15:00', 'Transferencia realizada con exito', 2);

insert into tb_destino_notificaciones values ( 1, 1 );
insert into tb_destino_notificaciones values ( 2, 2 );

insert into tb_destino_notificaciones_clientes values( 1, 1 );
insert into tb_destino_notificaciones_clientes values( 1, 2 );
insert into tb_destino_notificaciones_clientes values( 2, 1 );
insert into tb_destino_notificaciones_clientes values( 2, 2 );