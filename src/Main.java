import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner inp =new Scanner(System.in);
        String userName, password;
        int right =3, balance=1500;
        int select,deposit,withdraw = 0;
        while (right>0)
        {
            System.out.print("Please enter your username: ");
            userName=inp.nextLine();
            System.out.print("Please enter your password: ");
            password=inp.nextLine();

            if(userName.equals("muhammedslmz")&&password.equals("patika11"))
            {
                System.out.println("Login successful.");
              do {
                  System.out.println("Choose which action to take");
                  System.out.println("1-)Deposit\n2-)Withdraw\n3-)Balance Query\n4-)Exit");
                  select=inp.nextInt();
                  switch (select)
                  {
                      case 1:
                      {
                          System.out.print("Enter the amount you want to deposit: ");
                          deposit= inp.nextInt();
                          balance+=deposit;
                          System.out.println("New balance: "+balance);
                          break;
                      }
                      case 2:
                      {
                          int remainder=balance;
                          do {

                              System.out.print("Enter the amount you want to withdraw: ");
                              int withdrawCount = inp.nextInt();
                              withdraw=withdrawCount;

                              if(withdraw>remainder)
                              {
                                  System.out.println("You cannot withdraw more than your balance.");
                              }
                              else
                              {
                                  remainder-=withdraw;
                                  System.out.println("New balance: "+remainder);
                              }
                          }while (withdraw>balance);
                          balance=remainder;
                          break;
                      }
                      case 3:
                      {
                          System.out.println("Your balance: "+ balance);
                          break;
                      }
                      case 4:
                      {
                          System.out.println("is exiting..");
                          System.out.println("done!");
                          break;
                      }
                      default:
                      {
                          System.out.println("Please enter valid selection!");
                      }
                  }
              }while(select!=1||select!=2||select!=3||select!=4);
            }
            else
            {
                right--;
                System.out.println("Wrong username or password.");

                if(right==0)
                {
                    System.out.println("Your access to your account has been restricted! Contact your bank");
                }
                else System.out.println("Your remaining right: "+right);
            }
            break;
        }
    }
}
