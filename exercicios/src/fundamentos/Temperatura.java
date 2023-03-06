package fundamentos;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a temperatura em °F : ");
        double Fahrenheit = entrada.nextDouble();
        double Celsius = (Fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("A temperatura em °C é " + Celsius);
        entrada.close();
    }
}