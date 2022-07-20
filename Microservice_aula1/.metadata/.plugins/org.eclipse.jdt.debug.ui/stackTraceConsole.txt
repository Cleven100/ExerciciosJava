import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Infome o seu nome: /n");
        String caminhoArquivo = scanner.nextLine();

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(caminhoArquivo);
            os = new FileOutputStream("Copia de " + caminhoArquivo);
            byte[] buffer = new byte[1024];
            
            int length;

            while((length = is.read(buffer)) > 0) {
                os.write(buffer,0 , length);
            }
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}
