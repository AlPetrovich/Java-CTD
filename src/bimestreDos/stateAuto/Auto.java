package stateAuto;

public class Auto {
    //traemos el estado de la interface
    private StateAuto estado;
    //Estado del auto(apagado,parado,en marcha, sin combustible)
    private int velocidadActual;
    private int CombustibleActual;

    public Auto(int combustible){
        this.setCombustibleActual(combustible);
        //Estado inicial
        this.setEstado(new Apagado(this));
    }

    public void acelerar(){
        getEstado().acelerar();
        System.out.println("Velocidad actual: "+ getVelocidadActual()+" Combustible rest: "+ getCombustibleActual());
    }

    public void frenar(){
        getEstado().frenar();
    }
    public void contacto(){
        getEstado().contacto();
    }
    public void modificarVelocidad(int kmh){
        setVelocidadActual(getVelocidadActual()+kmh);
    }
    public void modificarCombustible(int decilitros){
        setCombustibleActual(getCombustibleActual()+decilitros);
    }

    public StateAuto getEstado() {
        return estado;
    }

    public void setEstado(StateAuto estado) {
        this.estado = estado;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getCombustibleActual() {
        return CombustibleActual;
    }

    public void setCombustibleActual(int combustibleActual) {
        CombustibleActual = combustibleActual;
    }
}
