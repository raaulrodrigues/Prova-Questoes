import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (fibonacci(num)){
            System.out.println("O número digitado pertence à sequencia de Fibonacci!");
        }else{
            System.out.println("O número digitado não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }

    public static boolean fibonacci(int num){
        int x = 0, y = 1;

        while (x < num){
            int temp = x;
            x = y;
            y = temp + y;
        }
        return x == num;
    }
}
