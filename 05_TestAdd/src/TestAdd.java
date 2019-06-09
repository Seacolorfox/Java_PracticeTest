import java.util.Scanner;

public class TestAdd
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        int count = input.nextInt();
        input.close();
        int sum = 0;
        int s =0;
       for(int i=0;i<count;i++)
       {
           sum +=Math.pow(10,i)*val;
           s+=sum;
       }
        System.out.println(s);
    }
}
