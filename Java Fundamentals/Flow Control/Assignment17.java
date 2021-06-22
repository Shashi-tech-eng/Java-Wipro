import java.util.Scanner;
public class Assignment17 {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number: ");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        int reverse=0;
        int digit;
        while(num!=0)
        {
            digit=num%10;
            reverse=reverse*10+digit;
            num= num/10;
        }
        System.out.println(reverse);
    }
}
