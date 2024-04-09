public class ContaPoupanca extends Conta{

    @Override
    int getFee(){
        return this.total * 3;
    }
}
