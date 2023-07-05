# CRUD de Pollería en Java

Este es un proyecto de CRUD (Crear, Leer, Actualizar, Eliminar) en Java para gestionar información de clientes y empleados relacionada con un negocio de pollos, desarrollado con el Modelo-Vista-controlador.

## Requisitos previos

- Java Development Kit (JDK) 18 instalado
- [mysql-connector-java.jar](https://dev.mysql.com/downloads/connector/j/) para la conexión con la base de datos.
- Login de página de inicio al ejecutar la aplicación:
  - Usuario: pollo
  - Contraseña: 1234

## Instalación

1. Clona o descarga este repositorio.

2. Asegúrate de tener el JDK 18 instalado en tu sistema.

3. Copia el archivo mysql-connector-java.jar en el directorio del proyecto.

4. Importa la base de datos pollos_db.sql en tu phpMyAdmin para configurar la estructura inicial de la base de datos.

5. Abre el proyecto en tu IDE de preferencia.

6. Configura la conexión a la base de datos:
   - Abre el archivo DatabaseConnection.java ubicado en rudPollos\build\classes\basedatos\BD.
   - Modifica las siguientes líneas con los detalles de tu base de datos:

     ```
     conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1/nombre-de-base-de-datos?serverTimezone=GMT-5","root","");
     ```

## Uso

La aplicación ofrece las siguientes funcionalidades:

- Registro de clientes y empleados.
- Visualización de información de clientes y empleados.
- Actualización de información de clientes y empleados.
- Eliminación de clientes y empleados.

Sigue las instrucciones en pantalla para interactuar con la aplicación.

Actualización de información de clientes y empleados.
Eliminación de clientes y empleados.
Sigue las instrucciones en pantalla para interactuar con la aplicación.
