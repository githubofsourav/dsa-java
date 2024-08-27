import java.util.Scanner;

public class Recursion_03 {
    // problem: 1 find sum of first N numbers using parameterised recursion

    private static void sumOfFirstN(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        sumOfFirstN(i - 1, sum + i);
    }

    // problem: 2 find sum of first N numbers using functional recursion
    private static int sumOfFirstNFunctional(int n) {
        if(n == 0)
            return 0;
        return n + sumOfFirstNFunctional(n - 1);
    }

    // problem 3: factorial parameterised
    private static void fact1(int n, int result) {
        if(n == 0) {
            System.out.println(result);
            return;
        }
        fact1(n - 1, result * n);
    }

    // problem 4: factorial functional
    private static int fact2(int n) {
        if(n == 0)
            return 1;
        return n * fact2(n -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        // sumOfFirstN(n, 0);
        // int result = sumOfFirstNFunctional(n);
        // System.out.printf("Result: %d\n", result);
        // fact1(n, 1);
        int result = fact2(n);
        System.out.printf("Result: %d\n", result);
        sc.close();
    }
}
