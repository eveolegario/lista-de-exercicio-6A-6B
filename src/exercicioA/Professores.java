package exercicioA;

public class Professores extends Funcionarios {

    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeAlunos;
    private int quantidadeTurmas;
    private int turma;

    public Professores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, double aumento, double salarioFinal, String nivelGraduacao, String disciplinaMinistrada, int quantidadeAlunos, int quantidadeTurmas, int turma) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario, aumento, salarioFinal);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurmas;
        this.turma = turma;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }

    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public void adicionarTurma(){
       turma = quantidadeTurmas++;
    }
    @Override
    public void aumentoSalarial() {
        double aumento = 0.10;
    }
}
