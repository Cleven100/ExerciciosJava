public class App {
    public static void main(String[] args) throws Exception {
       
     Gerente g1 = new Gerente();

     g1.setNome("Teste");
     g1.setSalario(5000.0);
     
     Funcionario f = new Funcionario();
     f.setSalario(2000.0);

     ControleBonificacao controle = new ControleBonificacao();
     controle.registra(g1);
     controle.registra(f);

     System.out.println(controle.getSoma());
    
     

    }
}
