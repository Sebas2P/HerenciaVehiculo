package Models;

public class Vehiculo {
    //los atributos que van a ser privados no se pueden heredar, para ello debemos
    //crear un constructor con los atributos que queremos heredar
    private String chasis;
    private Motor motor;

    public Vehiculo(String chasis, Motor motor) {
        this.chasis = chasis;
        this.motor = motor;
    }
    public Vehiculo(){
        //Constructor vacio
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void velocidad(double vMax){
        System.out.println("La velocidad maxima es: " + vMax);
        System.out.println("El torque es " + this.motor.getTorque());
    }
}
