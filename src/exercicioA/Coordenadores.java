package exercicioA;

public class Coordenadores extends Funcionarios {

    private int professoresSupervisionados;
    private int quantidadeProfessor;

    public Coordenadores() {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario, aumento, salarioFinal);
        this.professoresSupervisionados = professoresSupervisionados;
        this.quantidadeProfessor = quantidadeProfessor;
    }
    @Override
    public void aumentoSalarial() {
        double aumento = 0.05;
    }
    @Override
    public void Reembolso() {
        System.out.println("Reembolso feito");
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public int getQuantidadeProfessor() {
        return quantidadeProfessor;
    }

    public void setQuantidadeProfessor(int quantidadeProfessor) {
        this.quantidadeProfessor = quantidadeProfessor;
    }
    public void adicionarProfessor(){
        quantidadeProfessor = professoresSupervisionados++;
    }
}
