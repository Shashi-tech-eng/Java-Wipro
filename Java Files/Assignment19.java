import java.util.Scanner;
public class Assignment19 {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        scan.close();
        int count=0;
        while(count!=5)
        {
            if(num%2==0 && num%3==0 && num%5==0) {
                System.out.print(num + " ");
                count++;
            }
            num++;
            
        }
    }
}
