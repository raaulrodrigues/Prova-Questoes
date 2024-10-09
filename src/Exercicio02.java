import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = sc.nextLine();

        int contar = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'A') {
                contar++;
            }
        }

        if (contar > 0) {
            System.out.println("A letra 'a' aparece " + contar + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
        sc.close();
    }
}
