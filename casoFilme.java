import java.io.IOException;
import java.util.Scanner;

public class casoFilme {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C;
        // Escreva aqui a sua lógica
        C = (((B - A) * 100.00) / A);
        double percentual = B / A - 1;
        System.out.println(String.format("%.2f", percentual * 100) + "%");
    }

}