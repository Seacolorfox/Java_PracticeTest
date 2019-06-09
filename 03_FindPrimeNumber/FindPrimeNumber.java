public class FindPrimeNumber
{
    public static void main(String args[])
    {
        for (int i=101;i<=200;i++)
        {
            boolean flag = false;
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0)
                {
                    flag = false;
                    break;
                }
                else
                    flag = true;
            }
            if (flag==true)
                System.out.println(i);

        }
    }
}
