public class Emprestimo {
    protected double taxaMulta;
    public Emprestimo(double taxaMulta) {


        this.taxaMulta = taxaMulta;
    }
    public double calcularMulta(int diasAtraso){
        return diasAtraso * taxaMulta;
    }
}

class EmprestimoCurtoPrazo extends Emprestimo {
    public EmprestimoCurtoPrazo(double taxaMulta){
        super(taxaMulta);
    }
}
class EmprestimoLongoPrazo extends Emprestimo{
    public EmprestimoLongoPrazo(double taxaMulta){
        super(taxaMulta);
    }
}
