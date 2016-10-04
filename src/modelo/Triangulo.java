package modelo;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
	this.base = base;
	this.altura = altura;

    }

    public double calculaArea() {
	return (this.base * this.altura) / 2;
    }

    public String toString() {
	return "Triangulo - Base: " + this.base + " Altura: " + this.altura;
    }
}
