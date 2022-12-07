public class App {
    public static void main(String[] args) throws Exception {
        int[][] matriz = new int[][] {{5,-3}, {1, -3}, {3,10}};
        int Sln[] = {0,0,0};
        int x=0, i, j;

       
       
        for(i=0; i<=1; i++) {
            for(j=0; j<=1; j++){          
                    Sln[i] = Sln[i] + matriz[i][j];
            }
            x = x + Sln[i];
        }
        System.out.println(x);
    }
}
