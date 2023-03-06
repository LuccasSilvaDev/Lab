package fundamentos;

import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o raio: ");
        double raio = entrada.nextDouble();
        // double raio = 5.0;
        double area = 3.14159 * Math.pow(raio, 2);
        System.out.println(area);
        System.out.println(Math.PI);
        entrada.close();
    }
}