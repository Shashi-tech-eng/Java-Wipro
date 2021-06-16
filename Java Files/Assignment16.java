import java.util.Scanner;
public class Assignment16 {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
