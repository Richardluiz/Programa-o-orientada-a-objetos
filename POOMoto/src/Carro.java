public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas){
        super(marca,modelo,ano);
        this.numPortas = numPortas;
    }
    public int getNumPortas(){
        return numPortas;
    }
    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }

    @Override
    public String toString(){
        return "Tipo: Carro,"+ super.toString() + ",Número de Portas:" + numPortas;
    }
 }
