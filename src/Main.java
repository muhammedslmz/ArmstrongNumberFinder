import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp =new Scanner(System.in);
        double n= inp.nextDouble();
        double total=0;
        for (int i=1; i<=n;i++)
        {
            total+=i/n;
        }
        System.out.println(total);
    }
}
