package exercicioB.parte2;

public class Circulo implements FiguraGeometrica{

    double diametro;
    double circunferencia;
    double raio;
    double pi;

    public Circulo(double areaGeometrica, double diametro, double circunferencia, double raio, double pi) {
        this.diametro = 2 * raio;
        this.circunferencia = 2 * raio * pi;
        this.raio = 0;
        this.pi = 3.14;
    }

    @Override
    public void area() {
        double calcularArea = diametro * pi;
    }
}
