import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in); 
        int num=sc.nextInt();
        sc.close();
        if (num%2==0)
        {
            System.out.print(num+" is Even");
        }
        else
        {
            System.out.println(num+" is Odd");
        }
    }
}
