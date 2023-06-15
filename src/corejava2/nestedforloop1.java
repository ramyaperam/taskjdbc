package corejava2;

public class nestedforloop1 {
    public static void main(String[] args)
    {
        for (int ctr=10;ctr >0;ctr--)
        {
            for (int ptr=1;ptr<=ctr;ptr++)
            {
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
