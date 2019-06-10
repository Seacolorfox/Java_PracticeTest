import java.util.Scanner;

public class FindDaffodilNumber
{
    public static void main(String args[])
    {
        int A;
        int B=1;
        int sum = 0;
        int n = new Scanner(System.in).nextInt();
        for (int i = 100; i <= 100 * n; i++)
        {
            A =i;//wenti
            while (B>0)
            {
                B = A % 10;
                A = A / 10;

                sum += Math.pow(B, n);
                if (sum == i)
                    System.out.println(sum);
                else
                    sum = 0;
            }

        }
    }
    public static int change(int i)
    {
        int A = i;
        return A;
    }
}
