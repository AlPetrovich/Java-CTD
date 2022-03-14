package bimestreTres.daoStudents;

import bimestreTres.daoStudents.daos.EstudianteDaoH2;
import bimestreTres.daoStudents.entities.Estudiante;
import bimestreTres.daoStudents.services.EstudianteService;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante();
        estudiante.setId(1L);
        estudiante.setNombre("Javier");
        estudiante.setApellido("Rabuch");

        EstudianteService estudianteService = new EstudianteService();
        //seteamos estrategia
        estudianteService.setEstudianteIDao(new EstudianteDaoH2());

        estudianteService.guardarEstudiante(estudiante);




    }
}
