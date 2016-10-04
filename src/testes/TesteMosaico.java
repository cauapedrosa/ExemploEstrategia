package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import modelo.Circulo;
import modelo.Mosaico;
import modelo.Quadrado;
import modelo.Triangulo;

public class TesteMosaico {

    private Mosaico mosaico;

    @Before
    public void configura() {
	mosaico = new Mosaico();
    }

    @Test
    public void testaMosaicoComDoisTriangulos() {
	mosaico.insereFigura(new Triangulo(2, 2));
	mosaico.insereFigura(new Triangulo(3, 3));
	assertEquals(6.5, mosaico.calculaArea(), 0);
    }

    @Test
    public void testaMosaicoComDoisQuadrados() {
	mosaico.insereFigura(new Quadrado(2));
	mosaico.insereFigura(new Quadrado(3));
	assertEquals(13, mosaico.calculaArea(), 0);
    }

    @Test
    public void testaMosaicoComDoisCirculos() {
	mosaico.insereFigura(new Circulo(2));
	mosaico.insereFigura(new Circulo(3));
	assertEquals(40.8, mosaico.calculaArea(), 1);

    }

    @Test
    public void testaMosaicoComTresFigurasDiferentes() {
	mosaico.insereFigura(new Circulo(2));
	mosaico.insereFigura(new Quadrado(2));
	mosaico.insereFigura(new Triangulo(2, 2));
	assertEquals(18.5, mosaico.calculaArea(), 0.1);
    }

}
