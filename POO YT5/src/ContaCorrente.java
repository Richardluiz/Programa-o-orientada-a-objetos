public class ContaCorrente extends Conta{

    @Override
    int getFee(){
        return this.total * 2;
    }
}


