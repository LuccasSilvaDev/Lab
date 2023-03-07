package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class Ternarios {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um a média: ");
        Float Media = Entrada.nextFloat();

        String ResultadoParcial = Media >= 5.0 ? "em recuperação." : "reprovado";
        String ResultadoFinal = Media >= 7.0 ? "aprovado." : ResultadoParcial;

        System.out.println("O aluno está: " + ResultadoFinal);

        Entrada.close();
    }

}