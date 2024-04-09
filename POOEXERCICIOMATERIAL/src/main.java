public class main {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", 1899);
        Emprestimo emprestimoCurtoPrazo = new EmprestimoCurtoPrazo(0.50);
        Emprestimo emprestimoLongoPrazo = new EmprestimoLongoPrazo(0.25);

        int diasAtraso = 5;

        double multaCurtoPrazo = emprestimoCurtoPrazo.calcularMulta(diasAtraso);
        double multaLongoPrazo = emprestimoLongoPrazo.calcularMulta(diasAtraso);

        System.out.println("Multa por atraso no empréstimo de curto prazo: R$" + multaCurtoPrazo);
        System.out.println("Multa por atraso no empréstimo de longo prazo: R$" + multaLongoPrazo);
    }
}

