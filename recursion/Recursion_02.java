import java.util.Scanner;

public class Recursion_02 {
    // problem 1: print name N times
    private static void printName(int count, int n) {
        if(count > n)
            return;
        System.out.println("sourav");
        printName(count + 1, n);
    }

    // problem 2: print from 1 to N
    private static void printToN(int curr, int n) {
        if(curr > n) 
            return;
        System.out.println(curr);
        printToN(curr + 1, n);
    }

    // problem 3: print from N to 1
    private static void printNTo1(int curr, int n) {
        if(curr < 1)
            return;
        System.out.println(curr);
        printNTo1(curr - 1, n);
    }

    // problem 4: print 1 to N(backtracking)
    private static void print1ToNBackTrack(int cur, int n) {
        if(cur < 1)
            return;
        print1ToNBackTrack(cur - 1, n);
        System.out.println(cur);
    }    

    // problem 5: print N to 1(backtracking)
    private static void printNto1BackTrack(int curr, int n) {
        if(curr > n)
            return;
        printNto1BackTrack(curr + 1, n);
        System.out.println(curr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        // printName(1, n);
        // printToN(1, n);
        // printNTo1(n, n);
        // print1ToNBackTrack(n, n);
        printNto1BackTrack(1, n);
        sc.close();
    }
}
