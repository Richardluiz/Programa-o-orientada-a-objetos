public class Moto extends Veiculo {
      private boolean eletrica;

      public Moto(String marca, String modelo, int ano, boolean eletrica) {
          super(marca, modelo, ano);
          this.eletrica = eletrica;
      }

      public boolean isEletrica() {
          return eletrica;
      }

      public void setEletrica(boolean eletrica) {
          this.eletrica = eletrica;
      }

      @Override
      public String toString() {
          String eletricaStr = eletrica ? "Sim" : "Não";
          return "Tipo: Moto," + super.toString() + ", Elétrica:" + eletricaStr;

      }
  }
