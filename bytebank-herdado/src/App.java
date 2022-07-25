public class App {
    public static void main(String[] args) throws Exception {
       
      /*    Funcionario teste = new Funcionario();

         teste.setNome("Teste");
         teste.setCpf("000000000");
         teste.setSalario(2500);

         System.out.println(teste.getNome());
         System.out.println(teste.getBonificacao());  */
 

         FuncionarioTeste testeTwo = new FuncionarioTeste();
          testeTwo.setSalario(3000);
       
         System.out.println(testeTwo.getTipo());
         System.out.println(testeTwo.getBonificacao());


    }
}
