import java.util.Scanner;
public class Class2 {
    public static void main(String[] arg)
    {

        double[] a = new double [10];
        for(int i=0;i<10;i++)
            a[i]=Math.random()*100;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length-1;j++)
                if(a[j]>a[j+1])
                    swap(a,j,j+1);

        for(int i=0;i<10;i++)
        {
            System.out.println(a[i]);
        }
    }

    static void swap(double[] a, int left, int right)
    {
        if (left!=right)
        {
            double temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }
    }
}
