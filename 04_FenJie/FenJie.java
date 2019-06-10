import java.util.Scanner;

public class FenJie
{
    public static void main(String args[])
    {
        int n = new Scanner(System.in).nextInt();
        System.out.print(n+"=");
        for(int k = 2;k<=n;)
        {
            if(n==k)
            {
                System.out.print(k);
                break;
            }
            else
                if(n%k==0)
                {
                    System.out.print(k+"*");
                    n/=k;
                }
                else k++;
        }
    }
}
//  while (k<=n)
//  {
//        if(k==n)
//        {
//           System.out.print(n);
//           break;
//        }
//        else
//          if (n%k==0)
//          {
//              System.out.print(k+"*");
//               n=n/k;
//           }
//           else k++;
//   }