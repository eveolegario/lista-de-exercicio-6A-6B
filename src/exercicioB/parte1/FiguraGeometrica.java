package exercicioB.parte1;

public abstract class FiguraGeometrica {

    private double areaGeometrica;

    public FiguraGeometrica(double areaGeometrica) {
        this.areaGeometrica = areaGeometrica;
    }

    public double getAreaGeometrica() {
        return areaGeometrica;
    }

    public void setAreaGeometrica(double areaGeometrica) {
        this.areaGeometrica = areaGeometrica;
    }

    public abstract void area();

    }
