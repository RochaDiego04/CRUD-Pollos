-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-07-2023 a las 11:06:21
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `crudpollo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Edad` int(20) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Codigo` varchar(20) NOT NULL,
  `Sexo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Nombre`, `Apellido`, `Email`, `Edad`, `Telefono`, `Codigo`, `Sexo`) VALUES
('Mario', 'Ramirez', 'rami03@gmail.com', 34, '3321897654', '140', 'Masculino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Edad` int(20) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `Sexo` varchar(20) NOT NULL,
  `HorasPorMes` double NOT NULL,
  `PagoPorHora` double NOT NULL,
  `Codigo` varchar(20) NOT NULL,
  `Puesto` varchar(30) NOT NULL,
  `Sueldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`Nombre`, `Apellido`, `Email`, `Edad`, `Telefono`, `Sexo`, `HorasPorMes`, `PagoPorHora`, `Codigo`, `Puesto`, `Sueldo`) VALUES
('Miguel', 'Erhard', 'erhmem@gmail.com', 19, '3329018394', 'Masculino', 112, 30, '100', 'Intendente', 2822.4),
('Alan', 'Madrigal', 'alana@gmail.com', 20, '3345983098', 'Masculino', 90, 100, '101', 'Supervisor', 9000),
('juanita', 'Perez', 'juanito@gmail.com', 20, '123456', 'Femenino', 200, 100, '107', 'Cajero', 16800),
('aa', 'bb', 'cc', 34, '123456', 'Masculino', 500, 100, '106', 'cajero', 42000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
