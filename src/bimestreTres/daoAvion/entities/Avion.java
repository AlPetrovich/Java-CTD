package bimestreTres.daoAvion.entities;

public class Avion {

    private Long id;
    private String marca;
    private String modelo;
    private String matricula;
    private String fechaDeEntada;


    public Avion(Long id, String marca, String modelo, String matricula, String fechaDeEntada) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.fechaDeEntada = fechaDeEntada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaDeEntada() {
        return fechaDeEntada;
    }

    public void setFechaDeEntada(String fechaDeEntada) {
        this.fechaDeEntada = fechaDeEntada;
    }
}
