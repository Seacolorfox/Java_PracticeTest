public class _100MoneyBuy100Chickens
{
    public static void main(String args[]) {
        int cock;
        int hen;
        int chick;
        for (cock = 0; cock <= 20; cock++)
        {
            for (hen = 0; hen <= 33; hen++)
            {
                chick = 100-cock-hen;
//                for(chick=0;chick<=99;chick++)
//                    if(cock+hen+chick==100)
                    if ( 5 * cock + 3 * hen +chick/3== 100 && chick % 3 == 0)
                        System.out.println("cock:"+cock+"\then:"+hen+"\t  chick:"+chick);
            }
        }
    }
}
