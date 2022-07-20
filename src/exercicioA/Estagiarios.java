package exercicioA;

public class Estagiarios extends Funcionarios{

    private double bolsaAuxilio;

    public Estagiarios(double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario, aumento, salarioFinal);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public void Reembolso() {
        System.out.println("Reembolso feito");
    }


    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }
}
