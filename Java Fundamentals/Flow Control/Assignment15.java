import java.util.Scanner;
public class Assignment15 {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        int retainNum=num;
        int sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println(sum);
    }
    
}
