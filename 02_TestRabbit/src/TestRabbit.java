public class TestRabbit
{
    public static void main(String args[])
    {
        int A = 0;
        int B = 1;
        int sum=0;
        while(sum<=1000)
        {
            A=B;
            B=sum;
            sum=A+B;
            System.out.println(sum);
        }
    }
}