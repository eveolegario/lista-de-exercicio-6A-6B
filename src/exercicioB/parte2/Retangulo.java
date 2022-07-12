package exercicioB.parte2;

public class Retangulo implements FiguraGeometrica{

    double alturaRetangulo;
    double baseRetangulo;

    public Retangulo(double areaGeometrica, double alturaRetangulo, double baseRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
        this.baseRetangulo = baseRetangulo;
    }
    @Override
    public void area(){
        double calcularArea = alturaRetangulo * baseRetangulo;
    }

}
