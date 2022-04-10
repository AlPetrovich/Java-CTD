package bimestreTres.daoAvion.dao;

import bimestreTres.daoAvion.entities.Avion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImplAvionDaoH2 implements IDao<Avion> {

    private final static String DB_JDBC_DRIVER = "org.h2.Driver"; //guardamos driver de h2
    private final static String DB_URL = "jdbc:h2:~/db_aviones"; //BASE DE DATOS URL
    private final static String DB_USER = "sa";
    private final static String DB_PASSWORD = "";

    public ImplAvionDaoH2() {
    }

    @Override
    public Avion registrar(Avion avion) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //sentencia
            preparedStatement = connection.prepareStatement("INSERT INTO aviones VALUES(?,?,?,?,?)");
            preparedStatement.setLong(1, avion.getId());
            preparedStatement.setString(3,avion.getMarca());
            preparedStatement.setString(2,avion.getModelo());
            preparedStatement.setString(4,avion.getMatricula());
            preparedStatement.setString(5,avion.getFechaDeEntada());

            //ejecutamos
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return avion;
    }

    @Override
    public Avion buscarPorId(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Avion avion = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM aviones WHERE id = ? ");
            preparedStatement.setLong(1, id);


            //ejecutamos
            ResultSet resultSet =preparedStatement.executeQuery();

            while(resultSet.next()){
                Long idAvion = resultSet.getLong("id");
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                String matricula = resultSet.getString("matricula");
                String fecha = resultSet.getString("fechaDeEntrada");

                avion = new Avion(idAvion , marca , modelo, matricula, fecha);
            }

            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return avion;
    }

    @Override
    public void eliminar(Long id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //sentencia
            preparedStatement = connection.prepareStatement("DELETE FROM aviones WHERE id = ?");
            preparedStatement.setLong(1, id);

            //ejecutamos
            preparedStatement.executeUpdate();
            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Avion> buscarTodos() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        List<Avion> aviones = new ArrayList<>();

        try {
            Class.forName(DB_JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            //sentencia
            preparedStatement = connection.prepareStatement("SELECT * FROM aviones");

            //ejecutamos
            ResultSet resultSet =preparedStatement.executeQuery();

            while(resultSet.next()){
                Long idAvion = resultSet.getLong("id");
                String marca = resultSet.getString("marca");
                String modelo = resultSet.getString("modelo");
                String matricula = resultSet.getString("matricula");
                String fecha = resultSet.getString("fechaDeEntrada");

                aviones.add(new Avion(idAvion, marca, modelo, matricula, fecha));
            }

            preparedStatement.close();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return aviones;
    }
}
