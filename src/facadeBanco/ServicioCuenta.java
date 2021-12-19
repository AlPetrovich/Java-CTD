package facadeBanco;

import java.util.List;

public class ServicioCuenta {

    public Cuenta obtenerCuenta(List<Cuenta>cuentas, String dni){
        Cuenta cuenta=null;
        boolean encontrado=false;
        int i=0;
        while (!encontrado && i< cuentas.size()){
            if (cuentas.get(i).obtenerDNI().equals(dni)){
                cuenta=cuentas.get(i);
                encontrado=true;
            }
            i++;
        }
        return cuenta;
    }
}
