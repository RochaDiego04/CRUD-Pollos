# CRUD de Pollería en Java

Este es un proyecto de CRUD (Crear, Leer, Actualizar, Eliminar) en Java para gestionar información de clientes y empleados relacionada con un negocio de pollos, desarrollado con el Modelo-Vista-controlador.

## Requisitos previos

- Java Development Kit (JDK) 18 instalado
- [mysql-connector-java.jar](https://dev.mysql.com/downloads/connector/j/) para la conexión con la base de datos.
- Base de datos en phpMyAdmin con las siguientes credenciales:
  - Usuario: pollo
  - Contraseña: 1234

## Instalación

1. Clona o descarga este repositorio.

2. Asegúrate de tener el JDK 18 instalado en tu sistema.

3. Copia el archivo mysql-connector-java.jar en el directorio del proyecto.

4. Importa la base de datos pollos_db.sql en tu phpMyAdmin para configurar la estructura inicial de la base de datos.

5. Abre el proyecto en tu IDE de preferencia.

6. Configura la conexión a la base de datos:
   - Abre el archivo DatabaseConnection.java ubicado en src/main/java/com/tu_paquete/database/.
   - Modifica las siguientes líneas con los detalles de tu base de datos:

     ```
     String url = "jdbc:mysql://localhost:3306/nombre_base_de_datos";
     String user = "pollo";
     String password = "1234";
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
