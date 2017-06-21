
public class Test
{
    public static void main(String[] args) throws Exception
    {
        String[] ls = {"\u0008-", "\u0008\\",  "\u0008|", "\u0008/", "\u0008-", "\u0008\\",  "\u0008|", "\u0008/" };
        while (true)
        {
            for (String c : ls)
            {
                System.out.printf("\t%s",c);
                Thread.sleep(500);
            }
        }
    }
}
