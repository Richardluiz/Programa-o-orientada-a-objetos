
public class Main {
    public static void main(String[]args){

        ContaPoupanca contaPoupanca = new ContaPoupanca(100);
        ContaCorrente contaCorrente = new ContaCorrente(300);

        contaPoupanca.view();
        ContaCorrente.view();

    }
}
