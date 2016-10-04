package modelo;

public class Circulo extends Figura{
    private double raio;

    public Circulo(double raio) {
	this.raio = raio;
    }

    public String toString() {
	return "Circulo - Raio: " + this.raio;
    }

    public double calculaArea() {
	return Math.PI * this.raio * this.raio;
    }

}
