import java.util.Scanner;
public class Assignment7
{
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
   
        
    char ch = sc.next().charAt(0);
    sc.close();
    if (ch >= 'A' && ch <= 'Z')
            System.out.println( ch +"->"+Character.toLowerCase(ch));
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println( ch +"->"+Character.toUpperCase(ch));
    }
}