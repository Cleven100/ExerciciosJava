public class App {
    public static void main(String[] args) throws Exception {
     int a = 0, b = 0;
     
     int c = divide(a,b);
     System.out.print(c);

    }


public static int divide(int dividendo, int divisor) {
 
          



      try {
             return dividendo / divisor;
         } catch (RuntimeException e) {
          return -1;
        } catch (ArithmeticException e) {
            return 0;
         }  finally {
            System.out.print("Concluido");
         }
        
      

}

}