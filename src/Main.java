import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int a,b,gcb=0,lcm,bigOne;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the 2 number for find their GCB and LCM");
        a= input.nextInt();
        b= input.nextInt();
        int x=1;
        if(a>b)
        {
            bigOne=a;
        }
        else {
            bigOne=b;
        }

        for (int i=bigOne; x!=0;i--)
        {
            if(a%i==0&&b%i==0)
            {
                x=0;
                gcb=i;
            }
        }

        lcm=(a*b)/gcb;

        System.out.println("GCB: "+gcb);
        System.out.println("LCM: "+lcm);





    }
}
