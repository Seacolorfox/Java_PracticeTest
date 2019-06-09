public class FindPrimeNumber
{
    public static void main(String args[])
    {
        for (int i=101;i<=200;i++)
        {
            if(Math.sqrt(i)%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
