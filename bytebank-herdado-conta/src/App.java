public class App {
    public static void main(String[] args) throws Exception {
     ContaCorrente cc = new ContaCorrente(111, 10);
     cc.deposita(100.0);
   
     SeguroDeVida seguro = new SeguroDeVida();

     CalculadorDeImposto calc = new CalculadorDeImposto();
     calc.registra(cc);
     calc.registra(seguro);
     
     System.out.println(calc.getTotalImposto());
    
    }
}
