package DSA;

public class Bubblesort {

    public void sort(int a[])
    {
        for(int i=0;i<a.length-1;i++)//0 1
        {
          //  boolean flag=false;
            for (int j=0;j<a.length-i-1;j++)//pass=1 j=0;j<4 j=1;j<4 // pass=2 j=0;j<3 j=1;j<3 j=2;j<3
            {
                if(a[j]>a[j+1])//pass=1 64>34 64>25 64>12 64>22 //  pass-2 34>25 34>12 34>22
                {
                    int temp=a[j]; //temp=64 64 64 64 // 34 34 34
                    a[j]=a[j+1]; //a[0]=34 a[1]=25 a[2]=12 a[3]=22 // a[0]25 a[1]12 a[2]22
                    a[j+1]=temp;//a[1]=64  a[2]=64 a[3]=64 a[4]=64 // a[1]34 a[2]34 a[3]34
                   // flag=true;//
                }
            }
           // if(flag==false)
               // break;
        }
    }

    public void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }


    public static void main(String[] args) {

        Bubblesort b=new Bubblesort();

        int a[]={ 64, 34, 25, 12, 22};

        b.sort(a);
        b.display(a);
    }
}
