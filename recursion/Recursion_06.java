import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Recursion_06 {

    private static void printSubsequences(int idx, int[] arr, ArrayList<Integer> ds) {
        if(idx >= arr.length) {
            for(var i : ds) {
                System.out.print(i + " ");
            }
            if(ds.size() == 0)
                System.out.print("{}");
            System.out.println();
            return;
        }
        // take/pick, current element is added to subsequence
        ds.add(arr[idx]);
        printSubsequences(idx + 1, arr, ds);

        // not take/ not pick, current element is not added to subsequence
        ds.remove(ds.size() - 1);
        printSubsequences(idx + 1, arr, ds);
    }

    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        ArrayList<Integer> ds = new ArrayList<>();
        printSubsequences(0, arr, ds);
        sc.close();
    }
}
