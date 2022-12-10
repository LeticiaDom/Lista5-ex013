import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o numero de Linhas entre 1 e 20: ");
        int linhas = sc.nextInt();
        System.out.println("Informe o numero de Colunas entre 1 e 20: ");
        int colunas = sc.nextInt();
        sc.close();

        retangulo(linhas, colunas);
    }

    public static void retangulo(int linha, int coluna) {

        if (linha < 1) {
            linha = 1;
        } else if (linha > 20) {
            linha = 20;
        } else if (coluna < 1) {
            coluna = 1;
        } else if (coluna > 20) {
            coluna = 20;
        }

        System.out.println("+");
        for (int i = 0; i < linha; i++) {
            System.out.println("-");
        }
        System.out.println("+");
        for (int i = 0; i < coluna; i++) {
            System.out.println("|");
            for (int j = 0; j < linha; j++) {
                System.out.println(" ");
            }
            System.out.println("|");

        }
        System.out.println("+");
        for (int i = 0; i < linha; i++) {
            System.out.println("-");
        }
        System.out.println("+");
    }

}