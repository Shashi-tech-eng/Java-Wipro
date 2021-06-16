public class Assignment14 {
    public static void main(String[] args)
    {
        int flag=0;
        int num = Integer.parseInt(args[0]);
        if(num==1 || num==0)
        {
            System.out.println(num+" neither a Prime nor a Composite");
        }
        else
        {
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
                System.out.println(num+" Prime number");
            }
            else
            {
                System.out.println(num+" is not a Prime Number");
            }
        }
    }
}
