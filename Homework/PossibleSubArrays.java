import java.util.Scanner;
public class PossibleSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int start = 0; start < n; start++) {
            for(int end = start; end < n; end++) {
                System.out.print("[ ");
                for(int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("]");
            }
        }
        sc.close();
    }
}