package preFinal;

public class Main {
    public static void main(String[] args) {
        OfertaAcademica frontEnd= OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDescripcion("FrontEnd");
        ((Curso)frontEnd).setDuracion(2);
        ((Curso)frontEnd).setValorHora(1000);
        ((Curso)frontEnd).setCargaHoraria(16);

        OfertaAcademica backEnd= OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Curso");
        backEnd.setNombre("backEnd");
        backEnd.setDescripcion("backEnd");
        ((Curso)backEnd).setDuracion(2);
        ((Curso)backEnd).setValorHora(900);
        ((Curso)backEnd).setCargaHoraria(20);

        OfertaAcademica fullStack= OfertaAcademicaFactory.getInstance().crearOfertaAcademica("ProgramaIntensivo");
        fullStack.setNombre("FullStack");
        fullStack.setDescripcion("FullStack Front y Back");
        ((ProgramaIntensivo)fullStack).setPorcentajeBonificacion(0.20);

        //completar FullStack
        ((ProgramaIntensivo)fullStack).addOfertaAcademica(frontEnd);
        ((ProgramaIntensivo)fullStack).addOfertaAcademica(backEnd);

        Instituto dh= new Instituto("Digital House");
        dh.agregarOferta(frontEnd);
        dh.agregarOferta(backEnd);
        dh.agregarOferta(fullStack);
        System.out.println("Informe de ofertas disponibles en el instituto");
        dh.generarInforme();

        System.out.println("************************************************************");

        OfertaAcademica testing= OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Taller");
        testing.setNombre("Testing");
        testing.setDescripcion("Testing");
        ((Taller)testing).setCantTrabajosPracticos(10);
        ((Taller)testing).setValorTrabajoPractico(100);

        OfertaAcademica carrera =OfertaAcademicaFactory.getInstance().crearOfertaAcademica("Carrera");
        carrera.setNombre("CTD");
        carrera.setNombre("Carrera de jr a experto");
        ((Carrera)carrera).setValorBasico(50000);
        try{
            ((Carrera)carrera).agregarOfertaAcademica(frontEnd);
            ((Carrera)carrera).agregarOfertaAcademica(backEnd);
            ((Carrera)carrera).agregarOfertaAcademica(testing);
        }catch (Exception e){
            System.out.println("Error al crear la carrera: "+ carrera.getNombre()+" ->"+ e.getMessage());
        }

    }
}
