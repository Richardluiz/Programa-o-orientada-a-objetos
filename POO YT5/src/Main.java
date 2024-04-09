public class Main {
    public static void main(String[]args){

        Conta c;
        c= new ContaCorrente();

        c.viewValue();
        System.out.println(c.getFee());

        c = new ContaPoupanca();
        c.viewValue();
        System.out.println(c.getFee());
    }
}
