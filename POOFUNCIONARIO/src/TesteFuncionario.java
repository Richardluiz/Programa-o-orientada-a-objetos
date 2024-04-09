public class TesteFuncionario {
    public static void main(String[] args) {
        // Criando objetos de funcionários regulares e terceirizados
        funcionarioRegular regular1 = new funcionarioRegular("João", 20.0, 160);
        funcionarioRegular regular2 = new funcionarioRegular("Maria", 25.0, 150);

        FuncionarioTerceirizado terceirizado1 = new FuncionarioTerceirizado("Pedro", 22.0, 170, 500.0);
        FuncionarioTerceirizado terceirizado2 = new FuncionarioTerceirizado("Ana", 30.0, 140, 700.0);

        // Calculando e imprimindo os salários mensais de cada funcionário
        System.out.println("Detalhes dos Funcionários:");
        System.out.println(regular1.getNome() + " - Salário Mensal: R$" + regular1.calcularSalarioMensal());
        System.out.println(regular2.getNome() + " - Salário Mensal: R$" + regular2.calcularSalarioMensal());
        System.out.println(terceirizado1.getNome() + " - Salário Mensal: R$" + terceirizado1.calcularSalarioMensal());
        System.out.println(terceirizado2.getNome() + " - Salário Mensal: R$" + terceirizado2.calcularSalarioMensal());
    }
}