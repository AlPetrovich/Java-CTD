package bimestreTres.daoStudents.daos;

import bimestreTres.daoStudents.entities.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoH2 implements IDao<Estudiante> {

    private final static String DB_JDBC_DRIVER="org.h2.Driver";
    private final static String DB_URL="jdbc:h2:~/db_estudiantes";
    private final static String DB_USER="sa";
    private final static String DB_PASSWORD="";


    @Override
    public Estudiante guardar(Estudiante estudiante) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        //1 Levantar el driver y conectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);


            //Crear una sentencia con prepared

            preparedStatement =connection.prepareStatement("INSERT INTO estudiantes VALUES(?,?,?)");
            preparedStatement.setLong(1, estudiante.getId());
            preparedStatement.setString(2,estudiante.getNombre());
            preparedStatement.setString(3,estudiante.getApellido());

            //3 Ejecutar la sentencia y ademas modifica registro
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return estudiante;
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        //1 Levantar el driver y conectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);


            //Crear una sentencia con prepared

            preparedStatement =connection.prepareStatement("DELETE FROM estudiantes WHERE id=?");
            preparedStatement.setLong(1, id);

            //3 Ejecutar la sentencia y ademas modifica registro
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }

    @Override
    public Estudiante buscarPorId(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Estudiante estudiante = null;

        //1 Levantar el driver y conectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);


            //Crear una sentencia con prepared

            preparedStatement =connection.prepareStatement("SELECT * FROM estudiantes WHERE id=?");
            preparedStatement.setLong(1, id);

            //3 Ejecutar la sentencia y ademas modifica registro
            ResultSet resultSet =preparedStatement.executeQuery();

            //4 Evaluar o recorrer el resulSet
            while (resultSet.next()){
                Long idEstudiante = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);
            }

            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

        return estudiante;
    }

    @Override
    public List<Estudiante> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Estudiante> listEstudiantes = new ArrayList();

        //1 Levantar el driver y conectarnos
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);


            //Crear una sentencia con prepared

            preparedStatement =connection.prepareStatement("SELECT * FROM estudiantes ");


            //3 Ejecutar la sentencia y ademas modifica registro
            ResultSet resultSet =preparedStatement.executeQuery();

            //4 Evaluar o recorrer el resulSet
            while (resultSet.next()){
                Long idEstudiante = resultSet.getLong("id");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                Estudiante estudiante = new Estudiante();
                estudiante.setId(idEstudiante);
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);

                listEstudiantes.add(estudiante);
            }

            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

        return listEstudiantes;
    }
}
