package fundamentos.operadores;

public class Logicos {

    public static void main(String[] args) {

        // Tabela Verdade E
        System.out.println("\nTabela Verdade E And)");
        System.out.println(true && true);
        System.out.println(true && false);
        // System.out.println(false && true);
        // System.out.println(false && false);

        // Tabela Verdade OU
        System.out.println("\nTabela Verdade OU (Or)");
        // System.out.println(true || true);
        // System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        // Tabela Verdade OU Exclusivo
        System.out.println("\nTabela Verdade OU Exclusivo (xor)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

    }

}