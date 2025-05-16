package Models;

public class Auto extends Vehiculo{
    private int puertas;
    private double velocidad;

    public Auto(String chasis, Motor motor, int puertas, double velocidad) {
        super(chasis, motor);
        this.puertas = puertas;
        this.velocidad = velocidad;
    }//constructor padre

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getChasis() {
        return this.getChasis();//heredo el metodo de la clase padre Vehiculo
    }
}
