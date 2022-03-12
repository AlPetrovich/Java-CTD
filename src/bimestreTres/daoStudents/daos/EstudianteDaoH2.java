package bimestreTres.daoStudents.daos;

import bimestreTres.daoStudents.entities.Estudiante;

import java.util.List;

public class EstudianteDaoH2 implements IDao<Estudiante> {

    private final static String DB_JDBC_DRIVER="org.h2.Driver";
    private final static String DB_URL="jdbc:h2:~/db_estudiantes";
    private final static String DB_USER="sa";
    private final static String DB_PASSWORD="";


    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return null;
    }

    @Override
    public void eliminar(Long id) {

    }

    @Override
    public Estudiante buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Estudiante> buscarTodos() {
        return null;
    }
}
