
INSERT INTO tb_tipo_moneda (cod_tipo,nombre) VALUES ('1', 'Soles');
INSERT INTO tb_tipo_moneda (cod_tipo,nombre) VALUES ('2', 'Dolares');

INSERT INTO tb_clientes VALUES ('1', 'Polo', 'Ruiz', 'polor@gmail.com', '72585966', 'Lorena');
INSERT INTO tb_clientes VALUES ('2', 'Paredes', 'Mena', 'menap@gmail.com', '09069745', 'Jorge');

INSERT INTO tb_cuentas_bancarias VALUES ('1', '00110130020200365896', '152394', '5000', '4551708289685452', '1', '1');
INSERT INTO tb_cuentas_bancarias VALUES ('2', '00110130020000154855', '758596', '7500', '4551708145859855', '1', '2');

insert into tb_tipo_transaccion values ( 1, "Transferencia");
insert into tb_tipo_transaccion values ( 2, "Pago de servicio");

insert into tb_tipo_notificaciones values ( 1, "Campaña");
insert into tb_tipo_notificaciones values ( 2, "Transaccion");

INSERT INTO tb_usuarios values (1, 'juan', 'perez', 'tresdiez', 'asd');
INSERT INTO tb_usuarios values (2, 'jose', 'lopez', 'donplacer', '1234');
INSERT INTO tb_campanas (cod_camp, titulo, descripcion, fech_fin, fech_ini, fecha, hora, cod_usu_cod_usu) values (1, 'Cuenta Ganadora','Abre tu cuenta ganadora y participa por el carro del año','2000-07-07','2000-07-07','2000-07-07','7:00',1);
