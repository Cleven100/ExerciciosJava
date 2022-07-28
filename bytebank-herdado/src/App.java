public class App {
    public static void main(String[] args) throws Exception {
       
     Funcionario g1 = new Gerente();

     g1.setNome("Teste");
     String nome = g1.getNome();


    
     System.out.println(nome);

    }
}
