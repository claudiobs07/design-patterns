package br.com.claudiobs07.designpatterns.staticfactorymethod;

public class Coordenada {

    private double x;
    private double y;

    private Coordenada(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static final Coordenada toCartesiana(double x, double y) {
        return new Coordenada(x, y);
    }

    public static final Coordenada toPolarEmRadianos(double raio, double angulo) {
        return new Coordenada(raio * Math.cos(angulo), raio * Math.sin(angulo));
    }

    public static final Coordenada toPolarEmGraus(double raio, double angulo) {
        return new Coordenada(raio * Math.cos(Math.toRadians(angulo)), raio * Math.sin(Math.toRadians(angulo)));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
