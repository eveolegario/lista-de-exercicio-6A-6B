package exercicioB.parte1;

public abstract class Quadrado extends FiguraGeometrica{

    private double ladoQuadrado;

    public Quadrado(double areaGeometrica, double ladoQuadrado) {
        super(areaGeometrica);
        this.ladoQuadrado = ladoQuadrado;
    }

    public double getLadoQuadrado() {
        return ladoQuadrado;
    }

    public void setLadoQuadrado(double ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }
    @Override
    public void area(){
        double calcularArea = ladoQuadrado * ladoQuadrado;
    }
}
