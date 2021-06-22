public class Ass10 {

    public static void main(String args[])
    {
        int a=args.length;
        int i,j;
        int arr[][] = new int[9][9];
        if(a<4)
        {
        System.out.println("enter 9 values");
        }
        if(a==9)
            
        {
            int k=0;
        for(i=0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
                
            arr[i][j]=Integer.parseInt(args[k]);
            k++;
            }
            
        }
        
        for(i=0;i<3;i++)
        {
            for( j=0;j<3;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println("The reverse of array is:");
        int max = arr[0][0];
        for( i = 0; i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
        }
        System.out.println("Max Element is: "+max);
    
    
        
        
        }  
    }
    }