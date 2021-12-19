package facadeBanco;

public class ServicioCaja {

    void entregarDinero(Cuenta cuenta, double importe){
        cuenta.retirarDinero(importe);
    }
}
