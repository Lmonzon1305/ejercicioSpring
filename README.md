# ejercicioSpring
Creación de un Proyecto Maven con Spring boot- Uso de RestController:

CREATE DATABASE practica_programacion;

CREATE TABLE `clientes` (
  `id_cliente` int(20) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `dni` int(20) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `metodo_de_pago` varchar(255) NOT NULL,
  `monto` float NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB;

INSERT INTO `clientes` (`id_cliente`, `nombre`, `apellido`, `dni`, `direccion`, `metodo_de_pago`, `monto`) VALUES
(1, 'Leonel', 'Monzón', 41885254, 'Fader 108', 'Efectivo', 0),
(3, 'Diego', 'Vargas', 20452167, '', 'Mercado Pago', 2550.5),
(5, 'Ana', 'Rodrigez', 30798624, 'San Martin 255', 'Pendiente', 559.4),
(9, 'Nicolas', 'Diaz', 44050188, 'Estrada 237', 'Debito MasterCard', 1900);
