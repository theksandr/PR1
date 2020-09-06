import java.util.Scanner;
public class Class3 {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;
        for(int i=1;i<=n;i++)
            res = res*i;
        System.out.println(res);
    }
}
