import java.util.Scanner;
public class Assignment18 {
    public static void main(String[] args)
    {
        System.out.println("Enter a Number ");
        Scanner scan = new Scanner(System.in);
        String str=scan.next();
        scan.close();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed=reversed+str.charAt(i);
        }
        if(str.equals(reversed))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Pallindrome");
        }
    }
}
