package sequenciafibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;
        while (b < n) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == n || n == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();
        scanner.close();
        if (isFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}