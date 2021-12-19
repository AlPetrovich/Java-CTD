package preFinal2;

public class Main {
    public static void main(String[] args) {
        OfertaAcademica frontEnd= FabricaOfertaAcademica.getInstance().crearOfertaAcademica("Curso");
        frontEnd.setNombre("FrontEnd");
        frontEnd.setDescripcion("FrontEnd");
        ((Curso)frontEnd).setCargaHorariaMensual(16);
        ((Curso)frontEnd).setMesesDuracion(2);
        ((Curso)frontEnd).setPrecioHora(1000);

        OfertaAcademica backEnd= FabricaOfertaAcademica.getInstance().crearOfertaAcademica("Curso");
        backEnd.setNombre("backEnd");
        backEnd.setDescripcion("backEnd");
        ((Curso)backEnd).setCargaHorariaMensual(20);
        ((Curso)backEnd).setMesesDuracion(2);
        ((Curso)backEnd).setPrecioHora(900);

        OfertaAcademica fullStack= FabricaOfertaAcademica.getInstance().crearOfertaAcademica("Programa");
        fullStack.setNombre("FullStack");
        fullStack.setDescripcion("FullStack frontEnd y backEnd");
        ((Programa)fullStack).setPorcentajeBonificacion(0.20);
        ((Programa)fullStack).addOfertaAcademica(frontEnd);
        ((Programa)fullStack).addOfertaAcademica(backEnd);

        Instituto dh= new Instituto("Digital House");
        dh.agregarOferta(frontEnd);
        dh.agregarOferta(backEnd);
        dh.agregarOferta(fullStack);
        System.out.println("Informe de cursos y programas del instituto "+ dh.getNombre());
        dh.generarInforme();

        //***********************************************************************
        //                     ***********PARTE 2*************
        //***********************************************************************

        OfertaAcademica tallerDesign= FabricaOfertaAcademica.getInstance().crearOfertaAcademica("Taller");
        tallerDesign.setNombre("Talle Design Thinking");
        tallerDesign.setDescripcion("Talle Design Thinking");
        ((Taller)tallerDesign).setCantTP(3);
        ((Taller)tallerDesign).setPrecioTP(10);

        OfertaAcademica cursoIA= FabricaOfertaAcademica.getInstance().crearOfertaAcademica("Curso");
        cursoIA.setNombre("Inteligencia Artificial");
        cursoIA.setDescripcion("Inteligencia Artificial");
        ((Curso)cursoIA).setPrecioHora(100);
        ((Curso)cursoIA).setCargaHorariaMensual(2);
        ((Curso)cursoIA).setMesesDuracion(5);

        OfertaAcademica carreraUno= FabricaOfertaAcademica.getInstance().crearOfertaAcademica("Carrera");
        carreraUno.setNombre("CTD");
        carreraUno.setDescripcion("CTD");
        ((Carrera)carreraUno).setPrecioBasico(50000);
        try{
            ((Carrera)carreraUno).addOfertaAcademica(tallerDesign);
            ((Carrera)carreraUno).addOfertaAcademica(cursoIA);
            System.out.println("Cursos y Talleres agregados de forma Correcta");
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
