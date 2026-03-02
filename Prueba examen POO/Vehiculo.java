public class Vehiculo {
    private String matricula;
    private String modelo;
    private int porcentajeBateria;
    private boolean estaDisponible;

    public Vehiculo(String matricula, String modelo, int porcentajeBateria, boolean estaDisponible) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.porcentajeBateria = porcentajeBateria;
        this.estaDisponible = estaDisponible;
    }

    public Vehiculo() {
        this.matricula = "";
        this.modelo = "";
        this.porcentajeBateria = 0;
        this.estaDisponible = false;
    }

    // getters setters

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPorcentaje() {
        return porcentajeBateria;
    }

    public boolean isDisponible() {
        return estaDisponible;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPorcentaje(int porcentajeBateria) {
        this.porcentajeBateria = porcentajeBateria;
    }

    public void setDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }

    // método para imprimir

    public void mostrarInfo() {
        String textoDisponible;
        if (estaDisponible) {
            textoDisponible = "Está disponible";
        } else {
            textoDisponible = "No está disponible";
        }
        System.out.println("Matrícula: " + matricula + ". Modelo: " + modelo + ". Porcentaje de batería: "
                + porcentajeBateria + "%. Estado del vehículo: " + textoDisponible);
    }

}