import java.util.*;
public class Prefix_Sum
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i=0; i<n; i++)
    {
        a[i] = sc.nextInt();
    }
    int[] p = new int[n];
    for(int i=1; i<n; i++)
    {
        p[0]=0;
        p[i]=a[i]+p[i-1];
        System.out.println(p[i]+" ");
    }
}
