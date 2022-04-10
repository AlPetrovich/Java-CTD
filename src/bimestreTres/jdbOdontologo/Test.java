package bimestreTres.jdbOdontologo;

public class Test {

    private static final String SQL_TABLE_CREATE = "DROP TABLE IF EXISTS ODONTOLOGO;" +
            " CREATE TABLE USUARIO ( ID INT PRIMARY KEY, NOMBRE varchar(100) NOT NULL, APELLIDO varchar(100) NOT NULL, MATRICULA varchar(100) NOT NULL )";

    private static final String SQL_INSERT =  "INSERT INTO ODONTOLOGO (ID, NOMBRE, APELLIDO, MATRICULA) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE =  "UPDATE PACIENTE SET MATRICULA=? WHERE ID=?";


}
