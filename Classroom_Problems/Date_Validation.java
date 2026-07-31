import java.util.*;
public class Date_Validation
{
    public static void main(String[] args)
    {
                Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        if(d < 1 || d > 31 || m < 1 || m > 12 || y < 1)
        {
            System.out.println("Invalid Date");
        }
        else if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
        {
            System.out.println("Valid Date");
        }
        else if(m == 4 || m == 6 || m == 9 || m == 11)
        {
            if(d <= 30)
                System.out.println("Valid Date");
            else
                System.out.println("Invalid Date");
        }
        else 
        {
            if((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
            {
                if(d <= 29)
                    System.out.println("Valid Date");
                else
                    System.out.println("Invalid Date");
            }
            else
            {
                if(d <= 28)
                    System.out.println("Valid Date");
                else
                    System.out.println("Invalid Date");
            }
        }
    }
}