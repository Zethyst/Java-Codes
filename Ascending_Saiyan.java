import java.util.*;
class Ascending_Saiyan
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        int num[]=new int[10];
        int temp=0;
        System.out.println("Enter ten random numbers");
        for(int i=0;i<10;i++)
        num[i]=sc.nextInt();
        //Sorting using Bubble Sort
        for(int i=0;i<9;i++)
        {
            for (int j=i+1;j<10;j++)
            {
                if (num[i]>num[j])
                { 
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println ("Sorted numbers:");
        for (int i=0;i<10;i++)
        System.out.println (num[i]);
    }
}
                 