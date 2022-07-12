package exercicioA;

public class FuncionariosAdministrativos extends Funcionarios {

    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionariosAdministrativos(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, double aumento, double salarioFinal, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario, aumento, salarioFinal);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public void aumentoSalarial() {
        double aumento = 0.10;
    }
}
