package bimestreTres.jdbcUsuarios;

import java.sql.*;

public class Test {
    private static final String SQL_TABLE_CREATE = "DROP TABLE IF EXISTS USUARIO;" +
            " CREATE TABLE USUARIO ( ID INT PRIMARY KEY, NOMBRE varchar(100) NOT NULL, EMAIL varchar(100) NOT NULL, SUELDO numeric(15, 2) NOT NULL )";

    //insert usuario
    private static final String SQL_INSERT = "INSERT INTO USUARIO (ID, NOMBRE, EMAIL, SUELDO) VALUES(?,?,?,?)";
    //update sueldo usuario
    private static final String SQL_UPDATE= "UPDATE USUARIO SET SUELDO = ? WHERE EMAIL = ?";

    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario("Pedro","pedro@digitalhouse.com",10d);
        //guardar en BD
        Connection connection = null;
        //conexion dentro de un try
        try{
            connection = getConnection(); //metodo que creamos
            Statement statement = connection.createStatement(); //statement para crear tabla
            statement.execute(SQL_TABLE_CREATE);

            //Empezar a insertar en la base de datos ----PREPARESTATEMENT  INSERT-----
            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT); //enviar consulta

            psInsert.setInt(1,1);
            psInsert.setString(2,usuario.getNombre());
            psInsert.setString(3,usuario.getEmail());
            psInsert.setDouble(4,usuario.getSueldo());
            //EJECUCION------
            psInsert.execute();

            //EMPEZAMOS LA TX*------
            connection.setAutoCommit(false);
            //UPDATE
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            psUpdate.setDouble(1, usuario.subirSueldo(10d));
            psUpdate.setString(2,usuario.getEmail());
            //EJECUCION---
            psUpdate.execute();
            //GENERAMOS UN ERROR DESPUES DE EJECUTAR EL UPDATE
            int a = 4 / 0;

            //HACEMOS COMMIT------
            connection.commit();
            connection.setAutoCommit(true);
            //Correr una query para verificar si el sueldo es 20
            String sql = "SELECT * FROM USUARIO";
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery(sql);

            while (res.next()){
                //id, nombre, email , sueldo
                System.out.println(res.getInt(1) + res.getString(2) + res.getString(3)+ res.getDouble(4));
            }

        }catch (Exception e){
            //imprimir la traza
            e.printStackTrace();
            //regresar valores cambiados
            System.out.println("Realizando rollback ya que se produjo un error!");
            connection.rollback();

        }finally {
            connection.close();
        }

        //VERIFICAMOS QUE AL PRODUCIRSE UN ERROR DSP DEL UPDATE SE REALIZO EL ROLLBACK CORRECTAMENTE
        Connection connection1 = getConnection();
        String sql = "SELECT * FROM USUARIO";
        Statement stmte = connection1.createStatement();
        ResultSet resultSet =stmte.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+ resultSet.getString(2)+resultSet.getString(3)+ resultSet.getDouble(4));
        }
    }

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}
