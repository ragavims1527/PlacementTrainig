import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    System.out.print(a);
                }
                else
                    System.out.println(d);
            }
            else
                System.out.println(c);
        }
        else
        {
            if(b>c)
            {
                if(b>d)
                {
                    System.out.println(b);
                }
                else
                    System.out.println(d);
            }
            else
                System.out.println(c);
        }
    }
}