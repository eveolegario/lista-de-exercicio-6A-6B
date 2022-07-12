package exercicioB.parte1;

public class Triangulo extends FiguraGeometrica {
    double baseTriangulo;
    double alturaTriangulo;

    public Triangulo(double areaGeometrica, double baseTriangulo, double alturaTriangulo) {
        super(areaGeometrica);
        this.baseTriangulo = 0;
        this.alturaTriangulo = 0;
    }

    @Override
    public void area() {
        double calcularArea = (baseTriangulo * alturaTriangulo) / 2;
    }
}
