/**
 * Recursion_04
 */
public class Recursion_04 {
    // problem 1: reverse array
    // using loops
    private static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i ++;
            j --;
        }
    }

    // recursively using 1 variable
    private static void reverseArrayRecursively(int i, int arr[]) {
        System.out.println("LENGTH: " + arr.length);
        if(i >= arr.length/2)
            return;
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverseArrayRecursively(i + 1, arr);
    }

    // problem 2: check if a string is palindrome
    private static boolean isPalindrome(int idx, String input) {
        if(idx >= input.length()/2)
            return true;
        if(input.charAt(idx) != input.charAt(input.length() - idx - 1))
            return false;
        return isPalindrome(idx + 1, input);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        // reverseArray(arr);
        // reverseArrayRecursively(0, arr);
        boolean result = isPalindrome(0, "madm");
        System.out.println("Palindrome: " + result);
        // for(int i = 0; i < arr.length; i ++) {
        //     System.out.println(arr[i]);
        // }
    }
}