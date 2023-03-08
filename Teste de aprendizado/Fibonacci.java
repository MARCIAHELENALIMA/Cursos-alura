import java.util.Scanner;

public class Fibonacci {
    public static boolean isFibonacci(int num) {
        int a = 0, b = 1, c = 0;
        while (b < num) {
            c = a + b;
            a = b;
            b = c;
        }
        return b == num;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (isFibonacci(numero)) {
                System.out.printf("%d pertence à sequência de Fibonacci.", numero);
            } else {
                System.out.printf("%d não pertence à sequência de Fibonacci.", numero);
            }
        }
    }
}

