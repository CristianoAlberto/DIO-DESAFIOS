import java.util.Scanner; 

public class casoCirculo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		 //declare suas variaveis do tipo double

                  //continue a solucao
        double raio;
        raio=scan.nextDouble();
		double area = 3.14159 * (Math.pow(raio,2));

		System.out.printf("A=%.4f\n", area);
	}
}