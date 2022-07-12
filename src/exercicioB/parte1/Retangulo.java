package exercicioB.parte1;

public class Retangulo extends FiguraGeometrica{

    private double alturaRetangulo;
    private double baseRetangulo;

    public Retangulo(double areaGeometrica, double alturaRetangulo, double baseRetangulo) {
        super(areaGeometrica);
        this.alturaRetangulo = alturaRetangulo;
        this.baseRetangulo = baseRetangulo;
    }

    public double getAlturaRetangulo() {
        return alturaRetangulo;
    }

    public void setAlturaRetangulo(double alturaRetangulo) {
        this.alturaRetangulo = alturaRetangulo;
    }

    public double getBaseRetangulo() {
        return baseRetangulo;
    }

    public void setBaseRetangulo(double baseRetangulo) {
        this.baseRetangulo = baseRetangulo;
    }
    @Override
    public void area(){
        double calcularArea = alturaRetangulo * baseRetangulo;
    }
}
