package DSA;

public class Binarysearch {

    public  static int search(int arry[],int x)
    {
        int low=0;// 5
        int high=arry.length-1; // 9-1=8 //

        while (low<=high)//0<=8
        {
            int mid=(low+high)/2;// mid=0+8/2 = 4 mid=5+8/2=7 mid=5+6/2=6 mid=5+5/2 =5
            if(arry[mid]==x)// arry[4]==x 16==23 56==23 38==23 23==23
            {
                return mid;//
            }

            if(arry[mid]<x)  //arry[4]<23 16<23 56<23 38<23
            {
                low=mid+1; // low=4+1=5
            }
            else
            {
                high=mid-1;// high=7-1=6 // high=6-1
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    int arry[]={2,5,8,12,16,23,38,56,72,91};

    int x=6;


    int result=search(arry,x);
    if(result==-1)
    {
        System.out.println("Element not found");
    }
    else
    {
        System.out.println("Element found with index "+result);
    }

    }
}
