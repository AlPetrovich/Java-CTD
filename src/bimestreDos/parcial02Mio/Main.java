package parcial02Mio;

public class Main {
    public static void main(String[] args) {
        Construccion cnst1=new Construccion("Calle 12",2000,2004,2004);
        Construccion cnst2=new Construccion("Calle 12",2000,2004,2010);

        Proyecto py1= new Departamento(cnst1,1,"ale","san luis","finalizado",18,4);
        Proyecto py2= new Departamento(cnst2,1,"ale","san luis","finalizado",12,4);

        System.out.println(((Departamento)py1).compareTo(py2));
        System.out.println(((Departamento)py1).esRascacielos());

        System.out.println(((Departamento)py2).prueboOtro());

    }
}
