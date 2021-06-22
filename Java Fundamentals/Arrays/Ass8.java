import java.util.Scanner;

public class Ass8 {
    public static void main(String args[])
    {
        System.out.println("Enter array Size: ");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        int sum=0;
        boolean add = true;
        System.out.println("Enter array Elements: ");
        for(int i = 0;i<size;i++)
        {
            a[i]=scan.nextInt();
        }
        //Arrays.sort(a);
        for(int i=0; i<a.length;i++)
        {
    
            if(a[i] != 6 && add==true)
                sum = sum+a[i];
            else if(a[i] == 6){
                if((i+1) == a.length)
                    sum = sum+a[i];
                else
                    add = false;
            }
            else if(a[i] == 7)
                add = true;
        }
        System.out.println(sum);
        scan.close();
    }
}
