public class App {
    public static void main(String[] args) throws Exception {

      int soma;

      soma = soma1(1,0);
      System.out.println(soma);

    }

       static int soma1(int nro, int soma) {
            int s;

            if(nro == 100) {
                s = nro + soma;
            } else {
                s = soma1((nro+1), (nro+soma));
            }

            return s;

        }

}
