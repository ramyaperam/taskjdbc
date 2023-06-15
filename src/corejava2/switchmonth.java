package corejava2;

import java.util.Scanner;

public class switchmonth {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter month \n 1.jan \n 2.feb \n 3. mar ...... \n 12. dec");
        int month=scan.nextInt();
        String season;
        switch(month)
        {
            case 11:
            case 12:
            case 1:
            case 2:
                season="Winter";
                break;
            case 3:
            case 4:
            case 5:
                season="Spring";
                break;
            case 6:
            case 7:
                season="summer";
                break;
            case 8:
            case 9:
            case 10:
                season="fall";
                break;
            default:
                season = "this season doesn't exit";
                break;
        }
        System.out.println("month " + month + " falls in  " +season);

    }
}
