package modelo;

import java.util.ArrayList;
import java.util.List;

public class Mosaico {

    private List<Figura> figuras;

    public Mosaico() {

	this.figuras = new ArrayList<Figura>();
    }

    public void insereFigura(Figura figura) {
	this.figuras.add(figura);

    }

    public String toString() {
	String resultado = "";
	for (Figura figura : this.figuras)
	    resultado += figura.toString() + "\n";

	return resultado;
    }

    public double calculaArea() {
	double area = 0;

	for (Figura figura : this.figuras) {
	    area += figura.calculaArea();
	}
	return area;
    }

}
