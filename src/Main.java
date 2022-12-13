import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int num;
        int stepValue,numOfStep=0;
        int result=0;
       Scanner inp =new Scanner(System.in);
       num= inp.nextInt();
       int tempnum=num;
       while(tempnum !=0)
       {
           tempnum/=10;
           numOfStep++;
       }

        tempnum=num;

        for(int i =1; i<=numOfStep;i++)
        {
            stepValue=tempnum%10;
            result+=stepValue;
            tempnum/=10;
        }

        System.out.println("Sum of digits of the number: "+result);
    }
}
