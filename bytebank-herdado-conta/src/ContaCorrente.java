

public class ContaCorrente extends Conta {
    


    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
   }

   @Override
   public boolean saca(double valor) {
       // TODO Auto-generated method stub
       double valorDeSaque = valor + 0.2;
       return super.saca(valorDeSaque);
   }
}
