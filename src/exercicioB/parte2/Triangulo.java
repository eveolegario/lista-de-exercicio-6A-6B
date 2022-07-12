package exercicioB.parte2;

public class Triangulo implements FiguraGeometrica{

    double baseTriangulo;
    double alturaTriangulo;

    public Triangulo(double areaGeometrica, double baseTriangulo, double alturaTriangulo) {
        this.baseTriangulo = 0;
        this.alturaTriangulo = 0;
    }

    @Override
    public void area() {
        double calcularArea = (baseTriangulo * alturaTriangulo) / 2;
    }
}
