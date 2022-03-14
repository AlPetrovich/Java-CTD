package bimestreTres.jdbcPaciente;

import java.sql.*;

public class PacienteTest {

    //Parametrizar las consultas, para pasar solamente los parametros
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS PACIENTE; CREATE TABLE PACIENTE "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOMBRE varchar(100) NOT NULL, "
            + " PASSWORD varchar(100) NOT NULL"
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO PACIENTE (ID, NOMBRE, PASSWORD) VALUES (?,?,?)";
    private static final String SQL_UPDATE =  "UPDATE PACIENTE SET PASSWORD=? WHERE ID=?";

    private static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

    public static void main(String[] args) throws Exception{
        Connection connection = null;
        Paciente paciente1 = new Paciente("Pepe","1234");
        try {
            //Conexion, creacion de tablas e insersion
            connection = getConnection();
            Statement statement = connection.createStatement(); //Se usa para crear tablas, no se pasa parametros
            statement.execute(SQL_CREATE_TABLE);
            PreparedStatement insert = connection.prepareStatement(SQL_INSERT); //Se usa para transacciones, se pasa parametros
            insert.setInt(1,1); //values (x,?,?) primer valor posicion y el segundo el valor
            insert.setString(2,paciente1.getNombre());
            insert.setString(3, paciente1.getPassword());
            insert.execute();

            //Transaccion
            connection.setAutoCommit(false); //A partir de ahora todas las querys despues de ejecutarlos, no hacen commit, no va a generar cambios en la DB
            PreparedStatement update = connection.prepareStatement(SQL_UPDATE);
            update.setString(1,"abcd");
            update.setLong(2,1);
            update.execute();

            connection.commit();
            connection.setAutoCommit(true);

            String sql = "SELECT * FROM PACIENTE";
            Statement sqlSmt = connection.createStatement();
            ResultSet rs = sqlSmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
            }
        }
        catch (Exception e){
            connection.rollback();
        }
        finally {
            connection.close();
        }
        Connection connection2= getConnection();
        String sql = "SELECT * FROM PACIENTE";
        Statement sqlSmt = connection2.createStatement();
        ResultSet rs = sqlSmt.executeQuery(sql);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3));
        }
    }
}
