package br.com.claudiobs07.designpatterns.staticfactorymethod;

import org.junit.Assert;
import org.junit.Test;

public class CoordenadaTest {

    @Test
    public void testCoordenadaCartesiana() {
        Coordenada coordenada = Coordenada.toCartesiana(10, 0);
        Assert.assertEquals(10, coordenada.getX(), 0.0);
        Assert.assertEquals(0, coordenada.getY(), 0.0);
    }

    @Test
    public void testCoordenadaPolarEmRadianos() {
	Coordenada coordenada = Coordenada.toPolarEmRadianos(10, Math.PI * 2);
	Assert.assertEquals(10, coordenada.getX(), 0.001);
	Assert.assertEquals(0, coordenada.getY(), 0.001);
    }

    @Test
    public void testCoordenadaPolarEmGraus() {
	Coordenada coordenada = Coordenada.toPolarEmGraus(10, 360);
	Assert.assertEquals(10, coordenada.getX(), 0.001);
	Assert.assertEquals(0, coordenada.getY(), 0.001);
    }

}