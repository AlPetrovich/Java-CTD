package bimestreTres.daoAvion.services;
import bimestreTres.daoAvion.dao.IDao;
import bimestreTres.daoAvion.entities.Avion;

import java.util.List;


public class AvionService {

    private IDao<Avion> avionIDao;

    public AvionService() {

    }

    public AvionService(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    public void setAvionIDao(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    //metodos

    public Avion registrarAvion(Avion avion){
        avionIDao.registrar(avion);
        return avion;
    }

    public Avion buscarPorId(Long id){
        return avionIDao.buscarPorId(id);
    }

    public void eliminarAvion(Long id){
        avionIDao.eliminar(id);
    }

    public List<Avion> buscarTodos(){
        return avionIDao.buscarTodos();
    }
}
