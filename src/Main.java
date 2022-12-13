import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int numOfDigits=0;
        Scanner input=new Scanner(System.in);
        int num =input.nextInt();
        int tempnum=num;
        int stepValue;
        int stepExponent;
        int result=0;
        while (tempnum!=0)
        {
            tempnum/=10;
            numOfDigits++;
        }

        tempnum=num;
        while (tempnum!=0)
        {

            stepValue= tempnum%10;
            stepExponent=1;
            for(int i=1; i<=numOfDigits;i++)
            {
                stepExponent*=stepValue;
            }
            result+=stepExponent;
            tempnum/=10;

        }

        if(result==num)
        {
            System.out.println(num+" is Armstrong number.");
        }

        else System.out.println(num+" isn't Armstrong number.");


    }
}
