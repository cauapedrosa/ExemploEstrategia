package modelo;

public class Quadrado extends Figura{

    private double lado;

    public Quadrado(double lado) {
	this.lado = lado;
    }

    public String toString() {
	return "Quadrado - Lado: " + this.lado;
    }

    public double calculaArea() {
	return this.lado * this.lado;
    }

}
