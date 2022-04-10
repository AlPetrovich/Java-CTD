package bimestreTres.daoAvion;

import bimestreTres.daoAvion.dao.ImplAvionDaoH2;
import bimestreTres.daoAvion.entities.Avion;
import bimestreTres.daoAvion.services.AvionService;

public class Main {

    public static void main(String[] args) {


        Avion avion1 = new Avion(1L,"rusa","b2","8734274-xx23","12-1-2000");
        Avion avion2 = new Avion(2L,"eeuu","b4","8734274-xx23","12-1-2000");

        AvionService avionService = new AvionService();
        //seteamos la estrategia de persistencia
        avionService.setAvionIDao(new ImplAvionDaoH2());

        avionService.registrarAvion(avion1);
        avionService.registrarAvion(avion2);

        avionService.buscarTodos();
    }
}
