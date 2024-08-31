import java.util.Scanner;

public class Recursion_05 {
    
    // problem 1: fibonacci
    // using loops
    private static int fibByLoop(int n) {
        if(n == 0 || n == 1) return n;
        int fib1 = 0, fib2 = 1, res = 0;

        for(int i=1; i < n; i ++) {
            res = fib1 + fib2;
            fib1 = fib2;
            fib2 = res;
        }
        return res;
    }

    // using recursion
    private static int fibByRecursion(int n) {
        if(n <= 1) return n;

        return fibByRecursion(n - 1) + fibByRecursion(n - 2);
    }
    
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("Fibonnaci num: " + fibByLoop(n));
        System.out.println("Fibonacci[Recursion]: " + fibByRecursion(n));
        sc.close();
    }
}
