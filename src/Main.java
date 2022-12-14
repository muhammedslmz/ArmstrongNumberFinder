import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n= inp.nextInt();

        for (int i =0;i<=n;i++)
        {

            for (int j =0; j<(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int y=0;y<(2*i+1);y++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=0; i<=n; i++)
        {
            for (int k=0;k<(i+1);k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<(2*n-(2*i+1));j++)
            {
                System.out.print("*");
            }

            System.out.println(" ");
        }

    }
}
