public class WanShu
{
    public static void main(String args[])
    {

        for(int i=1;i<=1000;i++)
        {
            int storage=0;
            for(int j=1;j<i;j++)
            {
                if(i%j==0)
                    storage+=j;
                if(storage==i)
                {
                    System.out.println(storage);
                    break;
                }
            }
        }
    }
}
