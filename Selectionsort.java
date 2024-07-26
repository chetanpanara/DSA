package DSA;

public class Selectionsort {

    public void sort(int array[])
    {
        for (int i = 0; i < array.length-1; i++)
        {
            int min = i;// min=0 min=1
            for(int j = i+1; j < array.length; j++) //25 12 22 11  // 12 22
            {
                if(array[min]>array[j])// 25<64 12<64 22<64 11<64 // 12<25 22<25
                {
                    min=j; //min=25 12 22 11 //  12 22
                }

            }
            int temp=array[min];// temp=11
            array[min]=array[i];// aary[min]=64
            array[i]=temp;//array[1]=11
        }
    }

    public  void displayaaray(int arry[])
    {
        for(int i=0;i<arry.length;i++)
        {
            System.out.print(arry[i]+" ");
        }
    }

    public static void main(String[] args) {

        Selectionsort s = new Selectionsort();

        int array[]={64,25,12,22,11};


        s.sort(array);
        s.displayaaray(array);
    }
}
