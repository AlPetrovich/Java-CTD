package parcial;

public class Main {
    public static void main(String[] args) {
        Construccion construccion1=  new Construccion("San Luis",1996,2002,2004);
        Construccion construccion2=  new Construccion("San Luis",1996,2002,2002);

        ProyectoCasa casa1= new ProyectoCasa(construccion2,22,"home","san Carlos","finalizado",22.0,2,1);
        ProyectoCasa casa2= new ProyectoCasa(construccion2,22,"home","san Carlos","construyendo",22.0,2,1);
        System.out.println(casa1.finalizoEnFecha());
        System.out.println(casa2.finalizoEnFecha());

        ProyectoDepartamento departamento1= new ProyectoDepartamento(construccion1,22,"home","ss","finalizado",16,3);
        ProyectoDepartamento departamento2= new ProyectoDepartamento(construccion1,22,"home","ss","finalizado",3,3);
        System.out.println(departamento1.esRascacielos());
        System.out.println(departamento2.esRascacielos());
        System.out.println(departamento1.compareTo(departamento2));
    }
}
