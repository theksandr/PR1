public class Class<main> {
    public static void main(String[] arg)
    {
        int[] a = new int [10];

        int sum = 0, summ=0;
        for(int i=0;i<10;i++)        {
            a[i]=i+1;
        }
       int i = 0;
        for(i=0;i<10;i++)
        {
            sum+=i;
            summ+=a[i];
        }
        summ=0;
        i=0;
        do {
            summ+=a[i];
            i++;
        }while (i<10);

        System.out.println(summ);
    }
}
