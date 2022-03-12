import java.io.IOException;
import java.util.Scanner;

public class casoNotacaoCientifica {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        // Escreva aqui o seu código

        double X = leitor.nextDouble();
        System.out.println(String.format((String­.valueOf(X).startsWi­th("-") ? "" : "+") + "%.4E", X));

    }

}