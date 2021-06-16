import java.util.Scanner;
public class Assignment12 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int flag=0;
        int num=scan.nextInt();
        scan.close();
        if(num==1)
        {
            System.out.println("Neither a Prime nor a Composite");
        }
        if(num==2)
        {
            flag=0;
        }
        else
        {
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("not a Prime Number");
        }
    }
}
