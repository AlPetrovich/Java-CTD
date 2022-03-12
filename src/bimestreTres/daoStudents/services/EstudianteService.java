package bimestreTres.daoStudents.services;

import bimestreTres.daoStudents.daos.IDao;
import bimestreTres.daoStudents.entities.Estudiante;

import java.util.List;

public class EstudianteService{

    private IDao<Estudiante> estudianteIDao;

    public IDao<Estudiante> getEstudianteIDao() {
        return estudianteIDao;
    }

    public void setEstudianteIDao(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    public Estudiante guardarEstudiante(Estudiante e){
        //delegarle la responsabilidad de guardar al DAO
        estudianteIDao.guardar(e);
        return e;
    }

    public void eliminarEstudiante(Long id){
        estudianteIDao.eliminar(id);
    }

    public Estudiante buscarEstudiante(Long id){
        return estudianteIDao.buscarPorId(id);
    }

    public List<Estudiante> buscarTodos(){
        return estudianteIDao.buscarTodos();
    }
}
