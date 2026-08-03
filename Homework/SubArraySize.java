import java.util.Scanner;
public class SubArraySize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 3; i++) {
            for (int j = i; j < i + 3; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}