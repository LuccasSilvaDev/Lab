package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = Entrada.nextDouble();

        System.out.println("Digite um operador: ");
        String operador = Entrada.next();

        System.out.println("Digite outro valor: ");
        double outroValor = Entrada.nextDouble();

        double resultado = "+".equals(operador) ? valor + outroValor : 0;
        resultado = "-".equals(operador) ? valor - outroValor : resultado;
        resultado = "*".equals(operador) ? valor * outroValor : resultado;
        resultado = "/".equals(operador) ? valor / outroValor : resultado;
        resultado = "%".equals(operador) ? valor % outroValor : resultado;

        System.out.printf("%.2f %s %.2f = %.2f \n\n",
                valor, operador, outroValor, resultado);
        Entrada.close();
    }
}