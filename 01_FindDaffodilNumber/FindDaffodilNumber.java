import java.util.Scanner;
//很慢很慢很慢
public class FindDaffodilNumber
{
    private static void splitArry(int n)
    {
        int num = n;
        int sum = 0;
        int ary[] = new int[(num+"").length()];
        for(int i = ary.length-1;i>=0;i--){
            ary[i] = num%10;
            num /= 10;
        }
        for(int i = 0;i<=(n+"").length()-1;i++)
        {
            sum+=Math.pow(ary[i],(n+"").length());
            if(sum == n)
            {
                System.out.print("Yes:");
                System.out.println(sum);
            }
        }
    }
    public static void main(String args[])
    {
        int n = new Scanner(System.in).nextInt();
        for(int i = 100;i<=Math.pow(10,n);i++)
        {
            splitArry(i);
        }
    }
}
