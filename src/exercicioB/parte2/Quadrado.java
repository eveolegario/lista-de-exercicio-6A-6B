package exercicioB.parte2;

public class Quadrado implements FiguraGeometrica{

    double ladoQuadrado;

    public Quadrado(double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    @Override
    public void area() {
        double calcularArea = ladoQuadrado * ladoQuadrado;
    }
}