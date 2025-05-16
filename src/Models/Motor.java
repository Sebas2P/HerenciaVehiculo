package Models;

public class Motor {
    private int cFuerza;
    private double torque;


    public Motor(int cFuerza, double torque) {
        this.cFuerza = cFuerza;
        this.torque = torque;
    }

    public int getcFuerza() {
        return cFuerza;
    }

    public void setcFuerza(int cFuerza) {
        this.cFuerza = cFuerza;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }
}
