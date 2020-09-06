import java.util.Scanner;
public class Class4 {
    public static void main(String[] arg) {
        double a = 0;
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        for (double i = 1; i <= c; i++) {
            if (i % 2 == 0)
                a -= (1 / i);

            if (i % 2 != 0)
                a += (1 / i);
        }
        System.out.println(a + " ");
    }
}
