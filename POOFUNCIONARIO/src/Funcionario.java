class Funcionario {
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadasPorMes;

    // Construtor
    public Funcionario(String nome, double salarioPorHora, int horasTrabalhadasPorMes) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }

    // Métodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadasPorMes() {
        return horasTrabalhadasPorMes;
    }

    public void setHorasTrabalhadasPorMes(int horasTrabalhadasPorMes) {
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }
}

// Subclasse FuncionarioRegular
class funcionarioRegular extends Funcionario {
    public funcionarioRegular(String nome, double salarioPorHora, int horasTrabalhadasPorMes) {
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
    }

    // Método para calcular o salário mensal do funcionário regular
    public double calcularSalarioMensal() {
        return getSalarioPorHora() * getHorasTrabalhadasPorMes();
    }
}

// Subclasse FuncionarioTerceirizado
class FuncionarioTerceirizado extends Funcionario {
    private double adicionalTerceirizado;

    public FuncionarioTerceirizado(String nome, double salarioPorHora, int horasTrabalhadasPorMes, double adicionalTerceirizado) {
        super(nome, salarioPorHora, horasTrabalhadasPorMes);
        this.adicionalTerceirizado = adicionalTerceirizado;
    }

    // Método para calcular o salário mensal do funcionário terceirizado
    public double calcularSalarioMensal() {
        return (getSalarioPorHora() * getHorasTrabalhadasPorMes()) + adicionalTerceirizado;
    }
}








