package DSA;
//Linear search

import java.util.Scanner;

public class Linearsearch {

    public static int search(int array[],int n,int x)
    {
        for(int i=0;i<n;i++)
        {
            if(array[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int array[]={20,40,3,50,8,10,60};


        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();

        int result=search(array,array.length,number1);
        if(result==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("found with index "+result);
        }
    }
}
